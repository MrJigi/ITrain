// import styles from "./mapoverview.module.css";
// import React from 'react';
'use client';  // This makes the component run on the client side

import React, {useEffect, useState} from 'react';
import L from 'leaflet';
import 'leaflet/dist/leaflet.css';
import "leaflet-routing-machine";
import styles from './mapoverview.module.css';
import Papa from 'papaparse';
// import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
// import {any} from "prop-types";
// import Script from "next/script";
// import Script from "next/script"; // Assuming you have a CSS module

// import OpenRouteService from "../../configs/openRouteServiceV1/L.Routing.OpenRouteService"
// Manually import missing icons
// import markerIcon from 'leaflet/dist/images/marker-icon.png';
// import markerIconRetina from 'leaflet/dist/images/marker-icon-2x.png';
// import markerShadow from 'leaflet/dist/images/marker-shadow.png';


const parseCSV = async(fileUrl:string) => {
    const response = await fetch(fileUrl);
    const text = await response.text();
    const result = Papa.parse(text, {header: true});
    return result.data;
};

const Mapoverview: React.FC = () => {
    const [isClient, setIsClient] = useState(false);
    const [stops, setStops] = useState([]);
    const [stopTimes, setStopTimes] = useState([]);
    const [trips, setTrips] = useState([]);
    // const DefaultIcon = L.icon({
    //     iconUrl: require('leaflet/dist/images/marker-icon.png'),
    //     iconRetinaUrl: require('leaflet/dist/images/marker-icon-2x.png'),
    //     shadowUrl: require('leaflet/dist/images/marker-shadow.png'),
    //     iconSize: [25, 41], // Size of the icon
    //     iconAnchor: [12, 41], // Point of the icon which will correspond to marker's location
    //     popupAnchor: [1, -34], // Point from which the popup should open relative to the iconAnchor
    //     shadowSize: [41, 41], // Size of the shadow
    //
    // });
    // L.Marker.prototype.options.icon = DefaultIcon;





    useEffect(() => {
        //GTFS
        const loadData = async () => {
            // const stopsData = await parseCSV('/path/to/stops.txt');
            // const stopTimesData = await parseCSV('/path/to/stop_times.txt');
            // const tripsData = await parseCSV('/path/to/trips.txt');
            //
            // setStops(stopsData);
            // setStopTimes(stopTimesData);
            // setTrips(tripsData);

            // GTFS
        };
        loadData();
        // Set the flag to true once the component mounts (client-side)
        setIsClient(true);
    }, []);

    useEffect(() => {
        if (isClient) {
            // Initialize the map only if we're on the client
            const map = L.map('map').setView([51.505, -0.09], 13);
            // making manual markers to load in

            L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
                attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors',
            }).addTo(map);



            // Live tracking

            // const map = L.map('map').setView([14.0860746, 100.608406], 6);

            // //osm layer
            // const osm = L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
            //     attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
            // });
            // osm.addTo(map);
            //
            // // var marker = L.marker([51.5,-0.09]).addTo(map);
            // // Navigation locator
            // if(!navigator.geolocation) {
            //     console.log("Your browser doesn't support geolocation feature!")
            // } else {
            //     setInterval(() => {
            //         navigator.geolocation.getCurrentPosition(getPosition)
            //     }, 5000);
            // }



            // function getPosition(position: GeolocationPosition){
            //     var circle;
            //     var marker;
            //     // console.log(position)
            //     const lat = position.coords.latitude
            //     const long = position.coords.longitude
            //     const accuracy = position.coords.accuracy
            //
            //     if(marker) {
            //         map.removeLayer(marker)
            //     }
            //
            //     if(circle) {
            //         map.removeLayer(circle)
            //     }
            //
            //
            //     marker = L.marker([lat, long])
            //     circle = L.circle([lat, long], {radius: accuracy})
            //
            //     const featureGroup = L.featureGroup([marker, circle]).addTo(map)
            //
            //     map.fitBounds(featureGroup.getBounds())
            //
            //     console.log("Your coordinate is: Lat: "+ lat +" Long: "+ long+ " Accuracy: "+ accuracy)
            // }

            //End of live


            // Custom marker

            // const iconOptions = {
            //     iconUrl: "../../img/icons/location.png",
            //     iconSize: [38,95]
            // }


            // let customIcon = L.icon(iconOptions);
            //
            // var markerOptions = {
            //     icon: customIcon,
            //     draggable: true,
            // }
            //
            // map.on("click", function(e){
            //     var mc = new L.Marker(e.latlng.lat,e.latlng.lng,markerOptions).addTo(map);
            // })
            //
            //
            //
            // var marker = L.circle([51.4517713,5.4271443]).addTo(map);
            //
            // L.Routing.control({
            //     waypoints:[
            //         L.latLng(51.4638479,5.4712256),
            //         L.latLng(51.4517713,5.4271443)
            //     ]
            // }).addTo(map);


            //Routing directions
            //
            // const routingControl = L.Routing.control({
            //     waypoints: [
            //         L.latLng(51.505, -0.09), // Starting point
            //         L.latLng(51.51, -0.1),   // Destination point
            //     ],
            //
            //     router: new L.Routing.OpenRouteService('5b3ce3597851110001cf6248315e27f6f808461aac41ab3a010955c4'), // Use OpenRouteService API
            //     lineOptions: {
            //         styles: [{ color: 'blue', weight: 4 }],
            //     },
            //     createMarker: function() {
            //         return null; // Custom marker styling (optional)
            //     },
            //     showAlternatives: false,
            //     fitSelectedRoutes: true,
            // }).addTo(map);
            //
            // // Event to get route information like time and distance
            // routingControl.on('routesfound', function(e) {
            //     const routes = e.routes;
            //     const summary = routes[0].summary;
            //     console.log(`Distance: ${summary.totalDistance / 1000} km`);
            //     console.log(`Estimated time: ${summary.totalTime / 60} minutes`);
            // });
            //
            // //Marker spot
            // L.marker([51.44083, 5.47778]).addTo(map)
            //     .bindPopup('Eindhoven city')
            //     .openPopup();
            // //
            // //
            //

        }
    }, [isClient]); // Re-run only when the client is available


    return (
<div/>)
        // <MapContainer center={[52.3676, 4.9041]} zoom={12} style={{ height: '500px', width: '100%' }}>
        //     <TileLayer
        //         url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        //         attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
        //     />
        //     {stops.map(stop => (
        //         <Marker key={stop.stop_id} position={[stop.stop_lat, stop.stop_lon]}>
        //             <Popup>{stop.stop_name}</Popup>
        //         </Marker>
        //     ))}
        // </MapContainer>

        // <div className={styles.mapWrapper}>
        //     <div id="map" className={styles.mapBox}></div>
        //
        //     {/*<Script src="https://unpkg.com/leflet@1.9.4/dist/leaflet.js"></Script>*/}
        //
        //     <script>
        //         {/*var map = L.map('map').setView([14.0860746, 100.608406], 6);*/}
        //
        //
        //     </script>



            // <script
            //     dangerouslySetInnerHTML={{
            //         __html: `
            // console.log('This is an inline script running');
            // if(!navigator.geolocation){
            // throw new Error("no geolocation available");
            // }
          // `,
          //       }}
        //
        // </div>
    // );
};


export default Mapoverview;
