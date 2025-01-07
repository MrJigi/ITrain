import { MapContainer, Marker, Popup, TileLayer, useMapEvents} from "react-leaflet";
import React, {useEffect, useState, useRef} from 'react';
import 'leaflet/dist/leaflet.css';
import styles from './chargingStation.module.css';
import L from 'leaflet'
// import axios from 'axios';
// all the routing things
// This runs the components for the leaflet textures
// import '../leafletOverride/leafletRoutingMachineBox.css'
import 'leaflet-routing-machine/dist/leaflet-routing-machine.css';
import 'leaflet-routing-machine';
// This runs the components for the leaflet textures
import './chargingStation.module.css'
// import style from 'node_';
import '../leafletOverride/leafletRoutingMachineBox.css';

// full screen
// import 'leaflet.fullscreen';
// import 'leaflet.fullscreen/Control.FullScreen.css';
// import 'leaflet.fullscreen/Control.FullScreen';


import Button from "@mui/material/Button";
// all the routing things

// import customChargerMarkerIcon from "../../img/Marker/ev-charger.png";

// Fix Leaflet marker icons (manually override the default icon)

// Might be the reason why markers work
interface Position {
    latitude: number | null;
    longitude: number | null;
}

interface MapCenter {
    latitude: number;
    longitude: number;
}

interface AddressInfo {
    Title: string;
    Latitude: number;
    Longitude: number;
}

interface ChargingStation {
    AddressInfo: AddressInfo;
}

// Module declarations

declare module 'leaflet' {
    namespace Icon {
        interface Default {
            _getIconUrl?: string;
        }
    }
}

// Add custom button group props type
// interface CustomButtonGroupProps extends ButtonGroupProps {
//     onChange?: (event: FormEvent<HTMLDivElement>, value: number) => void;
//     value?: number;
// }

// Add interface for routing control options
interface ExtendedAltLineOptions extends L.Routing.LineOptions {
    styles: {
        color: string;
        fillColor: string;
        opacity: number;
        weight: number;
    }[];
    extendToWaypoints?: boolean;
    missingRouteTolerance?: number;
}

delete L.Icon.Default.prototype._getIconUrl;
L.Icon.Default.mergeOptions({
    iconRetinaUrl: 'https://cdn-icons-png.flaticon.com/128/17573/17573314.png',
    iconUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.7.1/images/marker-icon.png',
    shadowUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.7.1/images/marker-shadow.png',
});


class Waypoint  {
    private _latLng: L.LatLng;

    constructor(lat:number, lng:number) {
        this._latLng = new L.LatLng(lat,lng);
    }

    get latLng(): L.LatLng {
        return this._latLng;
    }

    set latLng(value: L.LatLng) {
        this._latLng = value;
    }
}

export default function ChargingStation():JSX.Element {
    const [isGeolocationOn, setGeolocationOn] = useState<boolean>(false);
    const [position, setPosition] = useState<Position>({ latitude: null, longitude: null });
    const mapRef = useRef<L.Map | null>(null);
    const markerRef = useRef<L.Marker | null>(null);
    const circleRef = useRef<L.Circle | null>(null);
    const [routingControl, setRoutingControl] = useState<L.Routing.Control | null>(null);
    const [stations, setStations] = useState<ChargingStation[]>([]);
    const [mapCenter, setMapCenter] = useState<MapCenter>({ latitude: 51.4416, longitude: 5.4697 });
    const [showMarkers, setShowMarkers] = useState<boolean>(true);
    const [selectMode, setSelectMode] = useState<"start" | "end">("start");
    const [startPoint, setStartPoint] = useState<L.LatLng | null>(null);
    const [endPoint, setEndPoint] = useState<L.LatLng | null>(null);
    const [value, setValue] = React.useState<number>(0);



    // Custom icons
    const chargingStationIcon = L.icon({
        iconUrl: 'https://cdn-icons-png.flaticon.com/128/17573/17573314.png',
        iconSize: [30, 40],
        iconAnchor: [15, 40],
        popupAnchor: [0, -40],
    });

    const startIcon = L.icon({
        iconUrl: 'https://cdn-icons-png.flaticon.com/256/9375/9375293.png',
        iconSize: [30, 40],
        iconAnchor: [15, 40],
        popupAnchor: [0, -40],
    });

    const endIcon = L.icon({
        iconUrl: 'https://cdn-icons-png.flaticon.com/256/9375/9375246.png',
        iconSize: [30, 40],
        iconAnchor: [15, 40],
        popupAnchor: [0, -40],
    });

    const fetchChargingStations = async (latitude: number, longitude: number): Promise<void> => {
        const username = "user";
        const password = "8ade47ad-124b-4123-964c-c42c9702cd97";
        const credentials = btoa(`${username}:${password}`);

        try {
            const response = await fetch(
                `http://localhost:8080/api/charging-stations/getCharge?latitude=${latitude}&longitude=${longitude}`,
                {
                    headers: {
                        "Authorization": `Basic ${credentials}`,
                    },
                }
            );

            if (!response.ok) {
                throw new Error("Failed to fetch the map");
            }

            const data = await response.json();
            setStations(data);
        } catch (error) {
            console.error("Error getting the map data", error);
        }
    };

    const handleMapClick = (e: L.LeafletMouseEvent): void => {
        const { lat, lng } = e.latlng;

        if (!routingControl) {
            const control = L.Routing.control({
                waypoints: [],
                routeWhileDragging: true,
                reverseWaypoints: true,
                showAlternatives: true,
                altLineOptions: {
                    styles: [
                        {
                            color: 'green',
                            fillColor: 'green',
                            opacity: 0.55,
                            weight: 5
                        }
                    ]
                },

                createMarker: function(i: number, waypoint: Waypoint) {
                    if (i === 0) {
                        return L.marker(waypoint.latLng, { icon: startIcon });
                    } else if (i === 1) {
                        return L.marker(waypoint.latLng, { icon: endIcon });
                    }
                    return L.marker(waypoint.latLng);
                },
            }).addTo(mapRef.current!);

            getResultBox(control);
            setRoutingControl(control);
        }

        if (selectMode === "start") {
            setStartPoint(L.latLng(lat, lng));
            routingControl.setWaypoints([L.latLng(lat, lng)]);
            setSelectMode("end");
        } else if (selectMode === "end") {
            setEndPoint(L.latLng(lat, lng));
            const waypoints = routingControl.getWaypoints();
            if (waypoints.length > 0) {
                routingControl.setWaypoints([waypoints[0].latLng, L.latLng(lat, lng)]);
            }
        }
    };

    const getResultBox = (control: L.Routing.Control): void => {
        const itineraryDiv = document.getElementById('path-results');
        if (!itineraryDiv) {
            console.error("Element with id 'path-results' not found.");
            return;
        }

        const routingControlContainer:HTMLElement|undefined = control.getContainer();
        const controlContainerParent = routingControlContainer?.parentNode;

        if (controlContainerParent && routingControlContainer) {
            controlContainerParent.removeChild(routingControlContainer);
        }

        itineraryDiv.appendChild(routingControlContainer);
    };

    const getPosition = (position: GeolocationPosition): void => {
        const locationIcon = L.icon({
            iconUrl: 'https://cdn-icons-png.flaticon.com/256/9567/9567040.png',
            iconSize: [30, 40],
            iconAnchor: [15, 40],
            popupAnchor: [0, -40],
        });

        const lat = position.coords.latitude;
        const long = position.coords.longitude;
        const accuracy = position.coords.accuracy;
        const map = mapRef.current;

        if (!map) return;

        if (markerRef.current) {
            map.removeLayer(markerRef.current);
        }

        if (circleRef.current) {
            map.removeLayer(circleRef.current);
        }

        markerRef.current = L.marker([lat, long], { icon: locationIcon });
        circleRef.current = L.circle([lat, long], { radius: accuracy });

        const featureGroup = L.featureGroup([markerRef.current, circleRef.current]).addTo(map);
        map.fitBounds(featureGroup.getBounds());
    };

    const toggleGeolocation = (): void => {
        if (!isGeolocationOn) {
            if (navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(
                    (position) => {
                        const { latitude, longitude } = position.coords;
                        setPosition({ latitude, longitude });
                        getPosition(position);
                    },
                    (error) => {
                        console.log("Error getting position: ", error);
                    }
                );
            } else {
                alert("Geolocation is not supported by this browser.");
            }
        } else {
            if (markerRef.current && mapRef.current) {
                mapRef.current.removeLayer(markerRef.current);
                markerRef.current = null;
            }
            if (circleRef.current && mapRef.current) {
                mapRef.current.removeLayer(circleRef.current);
                circleRef.current = null;
            }
            setPosition({ latitude: null, longitude: null });
        }
        setGeolocationOn(!isGeolocationOn);
    };

    const getGPSLocation = (): void => {
        if (!navigator.geolocation) {
            console.log("Your browser doesn't support geolocation feature!");
        } else {
            navigator.geolocation.getCurrentPosition(getPosition);
        }
    };

    useEffect(() => {
        getGPSLocation();
        fetchChargingStations(mapCenter.latitude, mapCenter.longitude);
    }, [mapCenter]);

    const MapEventsHandler: React.FC = () => {
        const map = useMapEvents({
            moveend: () => {
                const center = map.getCenter();
                fetchChargingStations(center.lat, center.lng);
            },
            click: handleMapClick,
        });
        return null;
    };

    const toggleMarkers = (): void => {
        setShowMarkers((prevState) => !prevState);
    };

    const toggleSelectMode = (): void => {
        setSelectMode((prevMode) => (prevMode === "start" ? "end" : "start"));
    };


    return (
        <div>

            {/*Sticky buttons to toggle in map*/}
            {/*<ButtonGroup*/}
            {/*    // className={styles.navigationTransportation}*/}
            {/*    // sx={{backgroundColor:"darkblue" ,color:"white"}}*/}
            {/*    value={value}*/}

            {/*    onChange={(event, newValue) => {*/}
            {/*        setValue(newValue);*/}
            {/*    }}>*/}
                <Button onClick={toggleMarkers}
                        sx={{color: "white", border: "solid white 3px"}}
                    // className={styles.buttonMUI}
                        className={`styles.toggle-button ${showMarkers ? "styles.show-markers" : "style.hide-markers"}`}>

                    {showMarkers ? "Hide Markers" : "Show Markers"}
                </Button>
                <Button className={'styles.buttonMUI'}
                        sx={{color: "white", border: "solid white 3px"}}
                        onClick={toggleGeolocation}>
                    {isGeolocationOn ? 'Turn Off Geolocation' : 'Turn On Geolocation'}
                </Button>
                <Button className={styles.buttonMUI}
                        sx={{color: "white", border: "solid white 3px"}}
                        onClick={toggleSelectMode}>
                    {selectMode === "start" ? "Select Start Point" : "Select End Point"}
                </Button>
            {/*</ButtonGroup>*/}
            {isGeolocationOn && position.latitude && position.longitude && (
                <div>
                    <p>Latitude: {position.latitude}</p>
                    <p>Longitude: {position.longitude}</p>
                </div>
            )}

            <div id="map" className={styles.mapBox}>


                <MapContainer
                    center={[mapCenter.latitude, mapCenter.longitude]}
                    zoom={12}
                    ref={mapRef}
                    className={styles.mapStyle}
                    // style={{height: '100vh', width: '100%'}}
                    whenReady={(event:any):void => {
                        mapRef.current = event.target;// Store map instance in ref
                    }}
                >
                    <TileLayer
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                        attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                    />

                    <MapEventsHandler/>

                    {showMarkers && stations.map((station, index) => (
                        <Marker key={index}
                                position={[station.AddressInfo.Latitude, station.AddressInfo.Longitude]}
                                icon={chargingStationIcon}
                        >
                            <Popup>{station.AddressInfo.Title}</Popup>
                        </Marker>
                    ))}

                </MapContainer>
            </div>
            {/*style={{display:"absolute", width: "22rem", height: "22rem", border: "1px solid #ccc", padding: "10px"}}*/}
            <div id='path-results' style={{height: "500px", width: "100%", border: "solid white 3px"}}>
                {/* Routing results will appear here */}
            </div>
        </div>
        // <MapContainer center={[52.3676,4.9041]} zoom={12} >
        //
        //     <TileLayer
        //         url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        //         attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap<a/> contributors'
        //     ></TileLayer>
        //     {stations.map((station,index) =>
        //     <Marker key={index} position={[station.AddressInfo.Latitude,station.AddressInfo.Longitude]}>
        //     <Popup>
        //         {station.AddressInfo.Title}
        //     </Popup>
        //     </Marker>
        //     )}
        //     </MapContainer>
    );


};