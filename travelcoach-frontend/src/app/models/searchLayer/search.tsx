import React, { useState, useEffect } from "react";
import { MapContainer, TileLayer, Marker, Popup, useMap } from "react-leaflet";
import L from "leaflet";
import "leaflet-routing-machine";
import "leaflet/dist/leaflet.css";
import axios from "axios";
import Search from "react-leaflet-search";
import styles from "./search.module.css"

const MapComponent = () => {
    const [startPoint, setStartPoint] = useState(null); // Starting point
    const [stationPoint, setStationPoint] = useState(null); // Town station
    const [endStationPoint, setEndStationPoint] = useState(null); // Destination station
    const [endPoint, setEndPoint] = useState(null); // Final destination
    const [trainRoutes, setTrainRoutes] = useState([]); // Train API results
    const [stage, setStage] = useState(1); // Stage of travel

    // Custom Icon
    const customIcon = new L.Icon({
        iconUrl: "https://unpkg.com/leaflet/dist/images/marker-icon.png",
        iconSize: [25, 41],
        iconAnchor: [12, 41],
    });

    // Fetch train data from API
    const fetchTrainRoutes = async () => {
        if (stationPoint && endStationPoint) {
            const fromStation = "STATION1"; // Replace dynamically
            const toStation = "STATION2"; // Replace dynamically

            try {
                const response = await axios.get(
                    `http://localhost:8080/api/trains/train-route?fromStation=${fromStation}&toStation=${toStation}`
                );
                setTrainRoutes(response.data.routes); // Assuming response has a 'routes' array
            } catch (error) {
                console.error("Error fetching train data:", error);
            }
        }
    };

    // Routing Control Logic
    const RoutingControl = () => {
        const map = useMap();

        useEffect(() => {
            if (stage === 1 && startPoint && stationPoint) {
                // Route to the first station
                L.Routing.control({
                    waypoints: [L.latLng(startPoint.lat, startPoint.lng), L.latLng(stationPoint.lat, stationPoint.lng)],
                    routeWhileDragging: true,
                }).addTo(map);
            } else if (stage === 3 && endStationPoint && endPoint) {
                // Route to final destination
                L.Routing.control({
                    waypoints: [L.latLng(endStationPoint.lat, endStationPoint.lng), L.latLng(endPoint.lat, endPoint.lng)],
                    routeWhileDragging: true,
                }).addTo(map);
            }
        }, [stage, startPoint, stationPoint, endStationPoint, endPoint, map]);

        return null;
    };

    // Handle travel stage updates
    const handleStageUpdate = () => {
        if (stage === 1) {
            setStage(2); // Move to train API fetching
            fetchTrainRoutes();
        } else if (stage === 2) {
            setStage(3); // Move to routing from destination station
        }
    };

    return (
        <div className="map-container">
            <div className="search-bar">
                <button onClick={handleStageUpdate}>Next Step</button>
            </div>
            <MapContainer center={[52.3676, 4.9041]} zoom={13} style={{ height: "500px", width: "100%" }}>
                <TileLayer url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png" />
                <Search
                    position="topleft"
                    inputPlaceholder="Search Start Point"
                    onSearch={(data) => setStartPoint({ lat: data.lat, lng: data.lng })}
                />
                <Search
                    position="topleft"
                    inputPlaceholder="Search Station"
                    onSearch={(data) => setStationPoint({ lat: data.lat, lng: data.lng })}
                />
                <Search
                    position="topleft"
                    inputPlaceholder="Search End Station"
                    onSearch={(data) => setEndStationPoint({ lat: data.lat, lng: data.lng })}
                />
                <Search
                    position="topleft"
                    inputPlaceholder="Search Destination"
                    onSearch={(data) => setEndPoint({ lat: data.lat, lng: data.lng })}
                />
                <RoutingControl />
                {startPoint && <Marker position={startPoint} icon={customIcon}><Popup>Start</Popup></Marker>}
                {stationPoint && <Marker position={stationPoint} icon={customIcon}><Popup>Station</Popup></Marker>}
                {endStationPoint && <Marker position={endStationPoint} icon={customIcon}><Popup>End Station</Popup></Marker>}
                {endPoint && <Marker position={endPoint} icon={customIcon}><Popup>Destination</Popup></Marker>}
            </MapContainer>
            <div className="train-results">
                {trainRoutes.map((route, index) => (
                    <div key={index} className="train-route">
                        <h4>{route.operator}</h4>
                        <p>From: {route.origin} - To: {route.destination}</p>
                        <p>Duration: {route.duration}</p>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default MapComponent;