import styles from "./schedule.module.css";
import React, {useEffect, useRef, useState} from "react";
import {getTripLayout} from '../../configs/routingAxios/tripPlannerService/tripPlannerService';
import LoadingIo from "@/app/models/loadingFile/loadingIo";
import ScheduleTimeline from "@/app/models/scheduleTimeline/scheduleTimeline";
import {Button} from "react-bootstrap";
import Badge from "@mui/material/Badge";
import RailwayAlertIcon from "@mui/icons-material/RailwayAlert";
import Dialog from "@mui/material/Dialog";
import DialogTitle from "@mui/material/DialogTitle";
import DialogContent from "@mui/material/DialogContent";
import DisturbanceBox from "@/app/models/disturbanceBox/disturbanceBox";
import DialogActions from "@mui/material/DialogActions";
import PropTypes from "prop-types";
import {formatDateOnly, formatTime} from "@/./app/helper/timeFormatter/FormatterHelper";
import {Stops,TripsItem,Destination,Legs,Origin} from "@/app/Response&Requests/ReisInformatie/TripsItem/TripsItem"
import axios from "axios";
import NotificationButton from "@/app/models/routeNotification/NotificationButton.tsx"

interface AxiosError {
    response?: {
        data?: {
            message?: string;
        };
        status?: number;
        statusText?: string;
    };
    message: string;
}

// interface StationRef {
//     startStation:string,
//     endStation:string,
//     startTime:string
// }

// interface TripsItem {
//     idx: number,
//     plannedDurationInMinutes: number;
//     actualDurationInMinutes: number;
//     transfers:number,
//     legs: Legs[]
//
// };
//
// interface Legs{
//     idx:number,
//     name:string,
//     direction:string,
//     cancelled:boolean,
//     origin: Origin,
//     destination: Destination,
//     stops:Stops[],
//
// }
// interface Destination{
//     name:string,
//     lat:number,
//     lng:number,
//     stationCode:string,
//     plannedDateTime:string,
//     plannedTrack:string,
//     actualTrack:string,
//     exitSide:string
//
// }
//
// interface Origin{
//     name:string,
//     lat:number,
//     lng:number,
//     stationCode:string,
//     plannedDateTime:string,
//     plannedTrack:string,
//     actualTrack:string,
// }
//
// interface Stops{
//     uicCode: number,
//     name:string,
//     lat:number,
//     lng:number,
//     plannedDepartureDateTime:string,
//     actualDepartureTrack:string,
//     plannedDepartureTrack:string,
//
// }

export default function Schedule({data}) {



    const [localStartStation, setLocalStartStation] = useState(data.startStation || "");
    const [localEndStation, setLocalEndStation] = useState(data.endStation || "");
    const [localStartTime, setLocalStartTime] = useState(data.startTime || "2024-11-25T11:36:00+01:00");
    const [travelPlan, setTravelPlan] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);
    // button behaviour
    const [open, setOpen] = React.useState(false);
    const [selectedSchedule, setSelectedSchedule] = useState([]); // Track selected schedule





    if (!data.startStation || !data.endStation) {
        console.log("data Info -->", data.startStation, data.endStation, data.startTime);
        return <p>{`No data existing for ${data.startStation || ''} to ${data.endStation || ''} at ${data.startTime || ''}`}</p>;
    }
    // if(!data.startStation || !data.endStation) console.log("data Info -->" + data.startStation + data.endStation + data.startTime);
    // return <p>${data.startStation + data.endStation + data.startTime} no data existing</p>;

    // if (!data.startStation || !data.endStation) {
    //     return <p>{`No data existing for ${data.startStation || ''} to ${data.endStation || ''} at ${data.startTime || ''}`}</p>;
    // }


    const fetchTravelInfo = async () => {
        setLoading(true);
        try {
            console.log("FETCHING FROM SCHEDULE", localStartStation, localEndStation);

            // Axios GET request
            const response = await axios.get(
                'http://localhost:8080/api/trip/tripPlannerStation', {
                    params: {
                        startStation: localStartStation,
                        endStation: localEndStation,
                    },
                }
            );

            // Axios automatically parses JSON, so no need for .json()
            setTravelPlan(response.data.trips || []);
        } catch (err) {
            const error = err as AxiosError;
            // Axios errors are in 'err.response.data'
            const errorMessage:string = error.response?.data?.message || error.message || "Error fetching travel plans";
            setError(errorMessage);
        } finally {
            setLoading(false);
        }
    };

    const disruption = {
        trackNumber: 1,
        disruptionInfo: "Signal failure detected",
        userEmail: "evaldas.drasutis@gmail.com",
    };


    // button behaviour


    // const handleSearch = async () => {
    //     setLoading(true);
    //     try {
    //         const data = await getTripLayout(fromStation, toStation);
    //         setTripLayout(data);
    //     } catch (error) {
    //         console.error('Error fetching trip data:', error);
    //     } finally {
    //         setLoading(false);
    //     }
    // };

    // const fetchTravelInfo = async () => {
    //     setLoading(true);
    //     try {
    //         console.log("data InfoFetch -->" +localStartStation + localEndStation);
    //
    //         const response = await fetch(
    //             // `http://localhost:8080/api/trip/tripPlannerStation?startStation=${localStartStation}&endStation=${localEndStation}`
    //             // `http://localhost:8080/api/trip/tripPlannerStation?startStation=${data.startStation}&endStation=${data.endStation}`
    //             `http://localhost:8080/api/trip/tripPlannerStation?startStation=${localStartStation}&endStation=${localEndStation}`
    //         );
    //         if (!response.ok) {
    //             throw new Error("Network response issue");
    //         }
    //         const data = await response.json();
    //         setTravelPlan(data.trips || []);
    //     } catch (err) {
    //         console.error("Error fetching travel plans:", err);
    //         setError(err.message || "Error fetching travel plans");
    //     } finally {
    //         setLoading(false);
    //     }
    // };

    function filterStations(travelPlan, startStation, endStation) {
        return travelPlan.filter(travelInfo => {
            const disturbanceStart = new Date(travelInfo.start);
            const disturbanceEnd = new Date(travelInfo.end);

            // Adjust your conditions for filtering as per your data structure
            return travelInfo.trips.some(trip =>
                trip.origin.name.toLowerCase() === startStation.toLowerCase() &&
                trip.destination.name.toLowerCase() === endStation.toLowerCase()
            );
        });
    }

    const handleClose = (event) => {
        event.stopPropagation();
        setOpen(false);
    };

    const handleClickOpen = (schedule) => {
        console.log(travelPlan);
        console.log(schedule);
        setSelectedSchedule(schedule);
        // console.log("selected Schedule"+JSON.stringify(selectedSchedule, null, 2));
        // fetchDisturbances();
        // Need a fetch method to show the legs and stops.
        setOpen(true);
    };


    // const formatTime= (timestamp:string)=>
    // {
    //     return new Date(timestamp).toLocaleTimeString('nl-NL',{
    //         hour: 'numeric',
    //         minute:'numeric',
    //         hour12:false
    //     });
    // };
    // const formatDateOnly=(timestamp:string)=>{
    //     return new Date(timestamp).toLocaleDateString('nl-NL',{
    //         year:'2-digit',
    //         month:'2-digit',
    //         day:'2-digit'
    //     })
    // }


    // This weirdo
    // const filteredStations = travelPlan.length > 0 && startStation ? filterStations(travelPlan, startStation, endStation) : [];

    useEffect(() => {
        console.log("Schedule initialized with:", data);
        console.log("Selected Schedule Updated:", selectedSchedule);
        if (localStartStation && localEndStation) {

            fetchTravelInfo(); // This ensures fetch is triggered whenever the stations change
        }
        // setLocalStartStation(data.startStation || "");
        // setLocalEndStation(data.endStation || "");
        // setLocalStartTime(data.startTime || "2024-11-25T11:36:00+01:00");


        // if (data.startStation && data.endStation) {
        //     fetchTravelInfo();
        // }
    }, [localStartStation, localEndStation,selectedSchedule]);


    if (loading) {
        return <LoadingIo />;
    }

    if (error) {
        return <div style={{ color: "red" }}>{String(error)}</div>;
    }



    // function filterStations(tripPlan, originStation,endStation,startTime) {
    //
    //         console.log('trip plan ' + {tripPlan});
    //         return travelPlan.filter(travelInfo => {
    //             const tripStart = new Date(travelInfo.start);
    //             const tripEnd = new Date(travelInfo.end);
    //             const userStartTime = new Date(startTime);
    //
    //             const isWithinTimeFrame = userStartTime >= tripStart && userStartTime <= tripEnd;
    //             const hasStation = travelInfo.stations.some(station =>
    //                 station.name.toLowerCase() === startStation.toLowerCase()
    //             );
    //
    //             console.log(`Checking time for travel info ${travelInfo.title}: ${isWithinTimeFrame}`);
    //             console.log(`Checking station for travel info ${travelInfo.title}: ${hasStation}`);
    //
    //
    //             return isWithinTimeFrame && travelInfo.stations.includes(startStation); // Ensure a valid return
    //         });
    //     }
    //
    // const filteredStations = travelPlan.length > 0 && startStation
    //     ? filterStations(tripPlan,travelPlan, startStation, startTime)
    //     : [];
    //
    // console.log("Filtered stations:", filteredStations);

    //     function filterStations(travelPlan, startStation, startTime) {
    //         return travelPlan.filter(travelInfo => {
    //             // Parse the start and end times of the disturbance
    //             const disturbanceStart = new Date(travelInfo.start);
    //             const disturbanceEnd = new Date(travelInfo.end);
    //             const userStartTime = new Date(startTime);
    //
    //             // Check if the provided start time falls within the disturbance period
    //             const isWithinTimeFrame = userStartTime >= disturbanceStart && userStartTime <= disturbanceEnd;
    //             console.log(`Checking time for disturbance ${disturbance.title}: ${isWithinTimeFrame}`);
    //             // Check if the provided station matches any station in the disturbance
    //             const hasStation = (disturbance.publicationSections || []).some(section =>
    //                 section.section.stations.some(station => station.name.toLowerCase() === startStation.toLowerCase())
    //             );
    //             console.log(`Checking station for disturbance ${disturbance.title}: ${hasStation}`);
    //
    //             return isWithinTimeFrame && hasStation;
    //         });
    //     }
    // }


    // useEffect(() => {
    //     if(startStation && endStation) {
    //         fetchTravelInfo();
    //     }
    // const toggleButton = toggleButtonRef.current;
    // const sidePanel = sidePanelRef.current;
    // const handleClick = () => {
    //     setIsActive(prevState => !prevState)
    // };
    //
    // if (toggleButton && sidePanel){
    //
    //     document.addEventListener("click", handleClick);
    // }
    //
    // return () => {
    //     if (toggleButton){
    //         document.removeEventListener("click",handleClick);
    //     }
    // };
    // },[startStation,endStation]);


    // const filteredStations = travelPlan.length > 0 && startStation ? filterStations(travelPlan, startStation, endStation) : [];


    return (

        // ====================================================
        <div className={styles.wrapperWindow}>
            <div className={styles.wrapperGridBox}>
                {travelPlan.length > 0 ? (

                    <ul className={styles.scheduleList}>
                        {travelPlan.map((trips:TripsItem, index) => (

                            <li onClick={() => handleClickOpen(trips)} key={index} className={styles.scheduleListItem}>
                            <span className={styles.scheduleShortInfo}>
                            <div className={styles.scheduleListTemplate}>
                            <div>
                                <h2>From {trips.legs[0]?.origin?.name}</h2>
                                <h2>To {trips.legs[0].direction}</h2>
                                <h4>Leaves at {formatDateOnly(trips.legs[0].destination.plannedDateTime)}</h4>
                                <h4>Leaves at {formatTime(trips.legs[0]?.origin.plannedDateTime)} - {formatTime(trips.legs[0].destination.plannedDateTime)}</h4>
                                <br/>
                                <h4>Transfers: {trips.transfers}/ Stations {trips.legs[0]?.stops.length}</h4>
                            </div>
                            <div>
                                <h5>Trip duration: {trips.actualDurationInMinutes} Minutes</h5>
                            </div>
                        </div>

                                <Dialog
                                    open={open}
                                    onClose={handleClose}
                                    aria-labelledby="alert-dialog-title"
                                    aria-describedby="alert-dialog-description"
                                >
                        <DialogTitle id="alert-dialog-title">

                            <ScheduleTimeline travelPlan={[selectedSchedule]}/>
                        </DialogTitle>
                        <DialogContent>

                        </DialogContent>
                        <DialogActions>

                            <Button onClick={handleClose} autoFocus>
                                Agree
                            </Button>

                            <NotificationButton
                                routeInformation={trips.legs} // Send legs info to the button
                                disruption={disruption}
                            />
                        </DialogActions>
                    </Dialog>


                                {/*{trips.legs.map((leg,legIndex)=> (*/}
                                {/*    <div key={legIndex} className={styles.legSection}>*/}

                                {/*        <h3>Leg {legIndex + 1}: From {leg.origin?.name} to {leg.destination?.name}</h3>*/}
                                {/*        <p>Duration: {leg.actualDurationInMinutes} minutes</p>*/}
                                {/*        <p>Train: {leg.name || "No train name available"}</p>*/}

                                {/*        /!* Iterate through stops for each leg *!/*/}
                                {/*        /!*<p>Stops:</p>*!/*/}
                                {/*        /!*<ul className={styles.stopList}>*!/*/}
                                {/*        /!*    {leg.stops.map((stop, stopIndex) => (*!/*/}
                                {/*        /!*        <li key={stopIndex} className={styles.stopItem}>*!/*/}
                                {/*        /!*            {stop.name} (Lat: {stop.lat}, Lng: {stop.lng})*!/*/}
                                {/*        /!*        </li>*!/*/}
                                {/*        /!*    ))}*!/*/}
                                {/*        /!*</ul>*!/*/}
                                {/*    </div>*/}

                                {/*))}*/}


                                {/*<h5>You will pass stations: {trips.legs[0]?.stops[0]?.name}, </h5>*/}
                                {/*{trips.legs.origin.name}*/}
                                {/*{trips.origin.lng}*/}
                                {/*{trips.origin.lat}*/}
                            </span>
                                <span className={styles.scheduleLongInfo}>
                            </span>
                            </li>
                        ))}
                    </ul>
                ) : (

                    <div style={{color: "black"}}>No travel plans found.</div>

                )}
            </div>
        </div>


    );
};
Schedule.propTypes = {
    data: PropTypes.shape({
        startStation: PropTypes.string,
        endStation: PropTypes.string,
        startTime: PropTypes.string,
    }).isRequired,
};