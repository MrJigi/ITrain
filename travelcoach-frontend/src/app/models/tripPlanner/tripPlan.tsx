// import React, { useState } from 'react';
// import { getTripLayout } from '../services/tripPlannerService';
//
// const TripPlanner = () => {
//     const [tripData, setTripData] = useState(null);
//     const [loading, setLoading] = useState(false);
//     const [error, setError] = useState("");
//
//     const fetchTripLayout = async (fromStation, toStation) => {
//         setLoading(true);
//         setError("null");
//         try {
//             const data = await getTripLayout(fromStation, toStation);
//             setTripData(data);
//         } catch (err) {
//             setError("Failed to fetch trip data");
//         } finally {
//             setLoading(false);
//         }
//     };
//
//     return (
//         <div>
//             <button onClick={() => fetchTripLayout('Eindhoven', 'Rotterdam')}>
//                 Fetch Trip
//             </button>
//             {loading && <p>Loading...</p>}
//             {error && <p>{error}</p>}
//             {tripData && <pre>{JSON.stringify(tripData, null, 2)}</pre>}
//         </div>
//     );
// };
//
// export default TripPlanner;