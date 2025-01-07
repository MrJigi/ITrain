// import { useMap } from 'react-leaflet';
// import L from 'leaflet';
// import 'leaflet-routing-machine';
// import { useEffect } from 'react';
// import './leafletRoutingMachineBox.css'
//
// const CustomRoutingMachine = () => {
//     const map = useMap();
//
//     useEffect(() => {
//         const control = L.Routing.control({
//             waypoints: [
//                 L.latLng(51.505, -0.09), // Replace with dynamic waypoints as needed
//                 L.latLng(51.515, -0.1),
//             ],
//             routeWhileDragging: true,
//             createMarker: function() { return null; }, // Remove default markers if needed
//         }).addTo(map);
//         L.routing.control().get
//         // Custom container override
//         const routingContainer = document.querySelector('.leaflet-routing-container');
//         if (routingContainer) {
//             routingContainer.classList.add('custom-routing-box'); // Add custom class for styling
//         }
//
//         return () => {
//             map.removeControl(control);
//         };
//     }, [map]);
//
//     return null;
// };
//
// export default CustomRoutingMachine;