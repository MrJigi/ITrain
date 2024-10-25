import {MapContainer, Marker, Popup , TileLayer,useMapEvents} from "react-leaflet";
import React, { useEffect, useState, useRef } from 'react';
import 'leaflet/dist/leaflet.css';
import styles from './chargingStation.module.css';
import L from 'leaflet'
// import axios from 'axios';
// all the routing things
import 'leaflet-routing-machine/dist/leaflet-routing-machine.css';
import 'leaflet-routing-machine';
// all the routing things

// import customChargerMarkerIcon from "../../img/Marker/ev-charger.png";

// Fix Leaflet marker icons (manually override the default icon)

// Might be the reason why markers work
delete L.Icon.Default.prototype._getIconUrl;
L.Icon.Default.mergeOptions({
    iconRetinaUrl: 'https://cdn-icons-png.flaticon.com/128/17573/17573314.png',
    iconUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.7.1/images/marker-icon.png',
    shadowUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.7.1/images/marker-shadow.png',
});


 export default function ChargingStation() {
     const [isGeolocationOn, setGeolocationOn] = useState(false);
     const [position, setPosition] = useState({latitude:null,longitude:null});

     // const mapRef = useRef(null);
     const mapRef = useRef(null);
     const markerRef = useRef(null);// GPS person icon
     const circleRef = useRef(null);//GPS circle icon
     const [routingControl, setRoutingControl] = useState(null); // map routing control
     // const routingControlRef = useRef(null); // Ref for routing control
    const [stations, setStations] = useState([]);
     // eslint-disable-next-line @typescript-eslint/no-unused-vars
    const [mapCenter, setMapCenter] = useState({ latitude: 51.4416, longitude: 5.4697 }); // Default coordinates
     const [showMarkers, setShowMarkers] = useState(true);
     const [selectMode, setSelectMode] = useState("start");
     const [startPoint, setStartPoint] = useState(null); // Track start point
     const [endPoint, setEndPoint] = useState(null);     // Track end point


     //========= Custom Icon parameters ========
     const chargingStationIcon = L.icon({
         iconUrl: 'https://cdn-icons-png.flaticon.com/128/17573/17573314.png',  // Replace with your custom icon URL
         iconSize: [30, 40],  // Customize the size of the icon
         iconAnchor: [15, 40],  // Anchor point for the icon (usually center-bottom)
         popupAnchor: [0, -40],  // Where the popup should appear in relation to the icon
     });


     const startIcon = L.icon({
         iconUrl: 'https://cdn-icons-png.flaticon.com/256/9375/9375293.png',  // Replace with a custom URL for start marker
         iconSize: [30, 40],  // Customize the size of the icon
         iconAnchor: [15, 40],  // Anchor point for the icon (center-bottom)
         popupAnchor: [0, -40],  // Popup position
     });

     const endIcon = L.icon({
         iconUrl: 'https://cdn-icons-png.flaticon.com/256/9375/9375246.png',  // Replace with a custom URL for end marker
         iconSize: [30, 40],  // Customize the size of the icon
         iconAnchor: [15, 40],  // Anchor point for the icon
         popupAnchor: [0, -40],  // Popup position
     });

     //========= Custom Icon parameters ========

     // ============ Charging station ============================================================
     const fetchChargingStations = (  latitude: number, longitude:number) => {
         const username = "user";
         const password = "8ade47ad-124b-4123-964c-c42c9702cd97";
         const credentials = btoa(`${username}:${password}`);
         fetch(`http://localhost:8080/api/charging-stations/getCharge?latitude=${latitude}&longitude=${longitude}`, {
             headers: {
                 "Authorization": `Basic ${credentials}`,
             },
         })
             .then((response) => {
                 if (!response.ok) {
                     throw new Error("Failed to fetch the map ");
                 }
                 return response.json()
             })
             .then((data) => setStations(data))
             .catch((error) => console.error("Error getting the map data ", error));
     };
     // ============ Charging station ============================================================

     // ============ Point A to B navigation ============================================================
     const handleMapClick = (e) => {
         const { lat, lng } = e.latlng;

         if (!routingControl) {
             // Create a new routing control and add it to the map
             const control = L.Routing.control({
                 waypoints: [], // Initially empty waypoints
                 routeWhileDragging: true,
                 createMarker: function (i,waypoint) {
                     if (i === 0) {
                         return L.marker(waypoint.latLng, { icon: startIcon });  // Use startIcon for the first waypoint
                     } else if (i === 1) {
                         return L.marker(waypoint.latLng, { icon: endIcon });  // Use endIcon for the second waypoint
                     }
                 }, // Disable default marker creation
             }).addTo(mapRef.current);

             // Set the first waypoint based on click
             // control.setWaypoints([L.latLng(lat, lng)]);
             setRoutingControl(control); // Save control to state
         }
         if (selectMode === "start") {
             setStartPoint(L.latLng(lat,lng))
             routingControl.setWaypoints([L.latLng(lat, lng)]); // Set start point as first waypoint
             setSelectMode("end");
             // routingControl.spliceWaypoints(0, 1, L.latLng(lat, lng)); // Set start point (first waypoint)
         } else if (selectMode === "end") {
             setEndPoint(L.latLng(lat,lng));
             const waypoints = routingControl.getWaypoints();
            if(waypoints.length > 0){
                // routingControl.spliceWaypoints(waypoints.length - 1, 1, L.latLng(lat, lng)); // Set end point (last waypoint)
                routingControl.setWaypoints([waypoints[0].latLng, L.latLng(lat,lng)]); // Set end point (last waypoint)
            }
         }

     };

     // ============ Point A to B navigation============================================================



        // const credentials = btoa(`${username}:${password}`);
     // ============Navigation================================================

     // Get position

     const getPosition = (position :any) => {
         //person // https://cdn-icons-png.flaticon.com/256/5361/5361019.png
          //io // https://cdn-icons-png.flaticon.com/256/16462/16462121.png
          // https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ficon-library.com%2Fimages%2Fpeople-icon-vector-png%2Fpeople-icon-vector-png-5.jpg&f=1&nofb=1&ipt=5d676bbdb673788e39f87bb0aff73d89ba26e81c392f0da9a51f96a20ccdc8d8&ipo=images
         const locationIcon = L.icon({
             iconUrl: 'https://cdn-icons-png.flaticon.com/256/9567/9567040.png',
             iconSize: [30, 40],  // Customize the size
             iconAnchor: [15, 40],  // Customize the anchor point
             popupAnchor: [0, -40], // Customize the popup anchor point
         })

         // let circle = null;
         // let marker= null;
         // console.log(position)
         const lat = position.coords.latitude
         const long = position.coords.longitude
         const accuracy = position.coords.accuracy
         const map = mapRef.current;


         if (!map) return;

         if(markerRef.current) {

             map.removeLayer(markerRef.current)
         }

         if(circleRef.current) {
             map.removeLayer(circleRef.current)
         }


         markerRef.current = L.marker([lat, long], {icon: locationIcon})
         circleRef.current = L.circle([lat, long], {radius: accuracy})

         const featureGroup = L.featureGroup([markerRef.current, circleRef.current]).addTo(map);


         map.fitBounds(featureGroup.getBounds());
         // mapRef.map('map').fitBounds(featureGroup.getBounds())

         console.log("Your coordinate is: Lat: "+ lat +" Long: "+ long+ " Accuracy: "+ accuracy)
     };

     // Get position

    //Gps start
    const toggleGeolocation = () => {
        if (!isGeolocationOn) {
            if (navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(
                    (position) => {
                        const {latitude, longitude} = position.coords;
                        setPosition({latitude, longitude});
                        // getPosition(position);

                     getPosition(position)

                    },
                    (error) => {
                        console.log("Error getting position: ", error);
                    }
                );
            } else {
                alert("Geolocation is not supported by this browser.");
            }
        } else {

            // const map = mapRef.current;

            if (markerRef.current){
                mapRef.current.removeLayer(markerRef.current);

                markerRef.current = null;
            }
            if (circleRef.current){
                mapRef.current.removeLayer(circleRef.current);


                circleRef.current = null;
            }
            setPosition({latitude: null, longitude: null});
        }
        setGeolocationOn(!isGeolocationOn);
    };



     const getGPSLocation = () => {
     // var marker = L.marker([51.5,-0.09]).addTo(map);
     // Navigation locator
     if(!navigator.geolocation) {
         console.log("Your browser doesn't support geolocation feature!")
     } else {
         // Probz don't need the interval to stop breaking it
         // setInterval(() => {
         //     navigator.geolocation.getCurrentPosition(getPosition)
         // }, 5000);
             navigator.geolocation.getCurrentPosition(getPosition)

     }
     };

     // ============Navigation============================================================

     useEffect(() => {
         getGPSLocation();
         fetchChargingStations(mapCenter.latitude,mapCenter.longitude);

     }, [mapCenter]);

     //Handle Event
     const MapEventsHandler = () => {
         const map =
             useMapEvents({
             moveend:() => {

                 const center = map.getCenter(); // Use here a map reference
                 // setMapCenter({latitude: center.lat,longitude: center.lng});
                 fetchChargingStations(center.lat,center.lng);
             },
             click: handleMapClick,
         });
         return null;
     };

     const toggleMarkers = () => {
         setShowMarkers((prevState) => !prevState);
     };

     const toggleSelectMode = () => {
         setSelectMode((prevMode) => (prevMode === "start" ? "end" : "start"));

     }


     return (
         <div>
             <button onClick={toggleMarkers}
                     className={`style.toggle-button ${showMarkers ? "style.show-markers" : "style.hide-markers"}`}>
                 {showMarkers ? "Hide Markers" : "Show Markers"}
             </button>
             <button onClick={toggleGeolocation}>
                 {isGeolocationOn ? 'Turn Off Geolocation' : 'Turn On Geolocation'}
             </button>
             <button onClick={toggleSelectMode}>
                 {selectMode === "start" ? "Select Start Point" : "Select End Point"}
             </button>
             {isGeolocationOn && position.latitude && position.longitude && (
                 <div>
                     <p>Latitude: {position.latitude}</p>
                     <p>Longitude: {position.longitude}</p>
                 </div>
             )}

             <div id="map" className={styles.mapBox}>
                 <MapContainer center={[mapCenter.latitude, mapCenter.longitude]}
                               zoom={12}
                               style={{height: '100vh', width: '100%'}}
                               whenReady={(event) => {
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