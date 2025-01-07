import {FC, useState} from "react";
import Button from "@mui/material/Button";
import {Legs} from "@/app/Response&Requests/ReisInformatie/TripsItem/TripsItem.tsx";
import axios from "axios";
// import {props} from "types-ramda";


// export default function routeNotification(RouteInformation:TripsItem) {


    interface TripsItemProps {
        legs: Legs[];
    }

    interface DisruptionProps {
    trackNumber:number;
    disruptionInfo:string;
    userEmail:string;
    }

    interface RouteNotificationProps {
        routeInformation: TripsItemProps;
        disruption: DisruptionProps;
    }


    // const [active,setActive] = useState(false);


    const NotificationButton: FC<RouteNotificationProps> = ({ routeInformation,disruption }) => {
        const [statusMessage, setStatusMessage] = useState<string>('');

        const handleCheckTrip = async () => {
            try {
                const { trackNumber, disruptionInfo, userEmail} = disruption;

                // Call the backend API
                // http://localhost:8080/api/disruption
                // /notify?track=1&details=Some kind of issue by the tracks&recipient=travelcoachio@gmail.com
                const response = await axios.post(
                    `http://localhost:8080/api/disruption/notify?track=${trackNumber}&details=${disruptionInfo}&recipient=${userEmail}`,
                    {
                        tripDetails: routeInformation.legs, // Send legs data
                    }
                );
                setStatusMessage(response.data); // Show disturbance message
            } catch (error) {
                console.error('Error checking trip:', error);
                setStatusMessage('Failed to check trip.');
            }
        };

        return (
            <div>
                <Button variant="contained" onClick={handleCheckTrip}>
                    Check Trip for Disturbances
                </Button>
                {statusMessage && <p>{statusMessage}</p>}
            </div>
        );
    };

// --------- MAIN COMPONENT ---------
const RouteNotification: FC<RouteNotificationProps> = ({ routeInformation, disruption }) => {
    return (
        <div>
            <NotificationButton
                routeInformation={routeInformation}
                disruption={disruption}
            />
        </div>
    );
};

export default RouteNotification;