import React, { useEffect, useState } from 'react';
import axios from 'axios';


interface Leg{

    idx: string;
    name: string;
    travelType: string;
    direction:string;
    origin: {
        name: string;
        plannedDateTime: string;
    };
    destination: {
        name: string;
        plannedDateTime: string;
    };
    stops: {
        map(arg0: (stop: any) => React.JSX.Element): React.ReactNode;
        name: string;
        lat: number;
        lng: number;
        plannedDepartureTime: string;
        actualArrivalTrack: string;


    }
}

const TripViewer: React.FC = () => {
    const [trips,setTrips] = useState<Leg[]>([]);

    useEffect(() => {
        axios.get('/api/trips')
            .then(response => setTrips(response.data.legs))
            .catch(error => console.error('Error fetching trips:', error));
    },[]);
    return (
        <div>
            <h1>Trips</h1>
            <ul>
                {trips.map((leg) => (
                    <li key={leg.idx}>
                        {leg.name} - {leg.origin.name} to {leg.destination.name}
                        (Departure: {leg.origin.plannedDateTime}, Arrival: {leg.destination.plannedDateTime})

                        <p>
                            {leg.stops?.map((stop) => (
                                <div key={stop.idx}>
                                    Stop: {stop.name} at {stop.plannedDepartureDateTime}
                                    Lat: {stop.lat} - Lng:{stop.lng}
                                    Time: {stop.plannedDepartureTime}
                                    Track: {stop.actualArrivalTrack}
                                </div>
                            ))}

                        </p>

                    </li>
                ))}
            </ul>
        </div>
    );


};

export default TripViewer;