// // Importing the API function
// // import { getTripLayout } from '../../configs/routingAxios/tripPlannerService/tripPlannerService';
//
// // Example Component
// import React, { useState } from 'react';
//
// const TripPlanner = () => {
//     const [tripData, setTripData] = useState(null);
//     const [loading, setLoading] = useState(false);
//     const [error, setError] = useState(null);
//
//     const fetchTripLayout = async () => {
//         setLoading(true);
//         setError(null);
//         try {
//             const data = await getTripLayout('Eindhoven', 'Rotterdam'); // Pass the required parameters
//             setTripData(data);
//         } catch (err) {
//             setError("Failed to fetch trip layout");
//         } finally {
//             setLoading(false);
//         }
//     };
//
//     return (
//         <div>
//             <button onClick={fetchTripLayout}>Fetch Trip</button>
//             {loading && <p>Loading...</p>}
//             {error && <p>{error}</p>}
//             {tripData && <pre>{JSON.stringify(tripData, null, 2)}</pre>}
//         </div>
//     );
// };
//
// export default TripPlanner;