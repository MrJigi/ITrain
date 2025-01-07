import React, { FC, useState, useEffect } from "react";
import axios, { AxiosError } from "axios";
import Button from "@mui/material/Button";
import {Legs} from "@/app/Response&Requests/ReisInformatie/TripsItem/TripsItem.tsx";


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
// Notification Button Component
const NotificationButton: FC<RouteNotificationProps> = ({ routeInformation, disruption }) => {
    const [statusMessage, setStatusMessage] = useState<string>(''); // State for displaying status

    const handleCheckTrip = async () => {
        try {
            const { trackNumber, disruptionInfo, userEmail } = disruption;

            // API POST request
            const response = await axios.post(
                `http://localhost:8080/api/disruption/notify?track=${trackNumber}&details=${disruptionInfo}&recipient=${userEmail}`,
                {
                    tripDetails: routeInformation, // Send travel data
                }
            );

            // Update status message based on the response
            setStatusMessage(response.data);
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

export default NotificationButton