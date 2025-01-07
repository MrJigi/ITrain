import * as React from 'react';
import Timeline from '@mui/lab/Timeline';
import TimelineItem from '@mui/lab/TimelineItem';
import TimelineSeparator from '@mui/lab/TimelineSeparator';
import TimelineConnector from '@mui/lab/TimelineConnector';
import TimelineContent from '@mui/lab/TimelineContent';
import TimelineOppositeContent from '@mui/lab/TimelineOppositeContent';
import TimelineDot from '@mui/lab/TimelineDot';
import FastfoodIcon from '@mui/icons-material/Fastfood';
import Divider from '@mui/material/Divider';
import LaptopMacIcon from '@mui/icons-material/LaptopMac';
import HotelIcon from '@mui/icons-material/Hotel';
// import RepeatIcon from '@mui/icons-material/Repeat';
import Typography from '@mui/material/Typography';

import styles from './scheduleTimeline.module.css'
import {useEffect, useState} from "react";
import {number} from "prop-types";
import {TripsItem, Legs, FareLegs, Fares} from "@/app/Response&Requests/ReisInformatie/TripsItem/TripsItem";
import {formatDate, formatDateOnly, formatTime} from "@/app/helper/timeFormatter/FormatterHelper"
// interface Stop {
//     name: string;
//     lat: number;
//     lng: number;
// }
//
// interface Trip {
//     legs: Leg[];
//     actualDurationInMinutes: number;
// }
//
//
// interface Leg {
//     origin: { name: string; plannedDateTime: string };
//     destination: { name: string; plannedDateTime: string };
//     actualDurationInMinutes: number;
//     name: string;
//     stops: Stop[];
// }

const ScheduleTimeline: React.FC<{travelPlan: TripsItem[]}> = ({travelPlan} ) => {
    const [tripPlan, setTripPlan] = useState<TripsItem[]>([]);
    const [selectedLegIndex, setSelectedLegIndex] = useState<number | null>(null);
    const [selectedTripIndex, setSelectedTripIndex] = useState<number | null>(null);
    const [farePrice,setFarePrice] = useState<number | null>(null);


    // Handle the leg selection
    const handleLegClick = (index: number) => {
        setSelectedLegIndex(index);
    };
    // Handle trip selection
    const handleTripClick = (index: number) => {
        setSelectedTripIndex(index);
    };

    const incrementIndex = (index: number | null) => {
        const newIndex = (index ?? 0) + 1; // Default to 0 if index is null or undefined
        setSelectedLegIndex(newIndex);
    };

    const setFarePricingState = (fareLegs:number) =>{
        setFarePrice(fareLegs)
    }

    const provideFarePrice = (fareLegs: FareLegs[]) => {
        let totalFare = 0;

        fareLegs.forEach((fareLeg) => {
            fareLeg.fares.forEach((fare) => {
                totalFare += fare.priceInCents;
            });
        });

        // Convert cents to euros/dollars and format it
        return (totalFare / 100).toFixed(2); // Converts cents to currency format
    };

    // Set tripPlan state when travelPlan is passed or changes
    useEffect(() => {
        setTripPlan(travelPlan);
    }, [travelPlan]);

    // Check if travelPlan is empty
    if (!Array.isArray(travelPlan) || travelPlan.length === 0) {
        return <div style={{color: "black"}}>No travel plans found.</div>;
    }


    return(

    <div className={styles.wrapperWindow}>
        <div className={styles.wrapperGridBox}>
            <Timeline position="alternate">
                {tripPlan.map((trip: TripsItem, tripIndex) =>
                    trip.legs.map((leg: Legs, legIndex) => (
                        <TimelineItem
                            key={`${tripIndex}`}
                            // onClick={()=> handleTripClick(legIndex)}
                            className={styles.timelineItem}
                            style={{
                                // cursor: "pointer",
                                backgroundColor: selectedLegIndex === legIndex ? "#f0f8ff" : "transparent", // Highlight selected
                            }}
                        >

                            <TimelineOppositeContent
                                sx={{m: "auto 0"}}
                                align={legIndex % 2 === 0 ? "right" : "left"} // Alternates alignment
                                variant="body2"
                                color="text.secondary"
                            >

                                {/*{leg.stops.map((stop, stopIndex) => (*/}
                                {/*    */}
                                {/*))}*/}
                                <p>Duration: {leg.plannedDurationInMinutes || "Unknown"} minutes</p>
                            </TimelineOppositeContent>
                            <TimelineSeparator>

                                {legIndex > 0 && <TimelineConnector/>} {/* Add connector for previous legs */}
                                <TimelineDot>
                                    <FastfoodIcon/>
                                </TimelineDot>
                                {legIndex < trip.legs.length - 1 &&
                                    <TimelineConnector/>} {/* Add connector for next legs */}
                            </TimelineSeparator>
                            <TimelineContent sx={{py: "12px", px: 2}}>
                                <Typography variant="h6" component="span">
                                    <h3>From {leg.origin?.name || "Unknown"}</h3><b/>
                                    <h4>Leaves At {formatDate(leg.origin?.plannedDateTime)}</h4>

                                </Typography>
                                {/*<Typography>*/}
                                {/*    <h2>To {leg.destination?.name || "Unknown"}</h2><b/>*/}
                                {/*        <h5>Leaves At {leg.destination?.plannedDateTime}</h5>*/}

                                {/*</Typography>*/}
                                <Divider style={{paddingTop: "1rem"}}/>


                                <div className={styles.legSection}>
                                    <h3>
                                        Transit {legIndex + 1}: From {leg.origin?.name} <br/>To {leg.destination?.name}
                                    </h3>
                                    <p>Duration: {trip.actualDurationInMinutes || "Unknown"} minutes</p>
                                    <p>Train: {leg.name || "No train name available"}</p>
                                    <br/>
                                    <p>Stops:</p>
                                    <ul className={styles.stopList}>
                                        {leg.stops.map((stop, stopIndex) => (
                                            <li key={stopIndex} className={styles.stopItem}>
                                                <h5>{formatTime(stop.plannedDepartureDateTime)}</h5>
                                                <p><h3>{stop.name}</h3> (Lat: {stop.lat}, Lng: {stop.lng})</p>
                                                <Divider/>

                                            </li>
                                        ))}

                                    </ul>
                                    {trip.fareLegs[0].fares[0].priceInCents}
                                    <Divider/>
                                </div>

                            </TimelineContent>
                        </TimelineItem>

                    ))
                )}

            </Timeline>
            <h3> Fare price: ${farePrice}</h3>
        </div>
    </div>

        // <div>
        //     {travelPlan.length > 0 ? (
    //         travelPlan.map((item, index) => (
    //             <div key={item.idx}>
    //                 <p>Travel Plan {index + 1}</p>
    //                 <p>From: {item.sourceCtxRecon}</p>
    //                 <p>To: {item.ctxRecon}</p>
    //                 <p>Planned Duration: {item.plannedDurationInMinutes} minutes</p>
    //             </div>
    //         ))
    //     ) : (
    //         <p>No travel plans available</p>
    //     )}
    // </div>


    // <div className={styles.wrapperWindow}>
    //     <div className={styles.wrapperGridBox}>
    //         <Timeline position="alternate">
    //             {tripPlan.map((trip, tripIndex) => (
    //                 <TimelineItem key={tripIndex}>
    //                     <TimelineOppositeContent
    //                         sx={{ m: "auto 0" }}
    //                         align="right"
    //                         variant="body2"
    //                         color="text.secondary"
    //                     >
    //                         Trip Duration: {trip.actualDurationInMinutes} minutes
    //                     </TimelineOppositeContent>
    //                     <TimelineSeparator>
    //                         <TimelineConnector />
    //                         <TimelineDot>
    //                             <FastfoodIcon />
    //                         </TimelineDot>
    //                         <TimelineConnector />
    //                     </TimelineSeparator>
    //                     <TimelineContent sx={{ py: "12px", px: 2 }}>
    //                         <Typography variant="h6" component="span">
    //                             From {trip.legs[0]?.origin?.name || "Unknown"}
    //                         </Typography>
    //                         <Typography>
    //                             To {trip.legs[0]?.destination?.name || "Unknown"}
    //                         </Typography>
    //                         {trip.legs.map((leg, legIndex) => (
    //                             <div key={legIndex} className={styles.legSection}>
    //                                 <h3>
    //                                     Leg {legIndex + 1}: From {leg.origin?.name} to{" "}
    //                                     {leg.destination?.name}
    //                                 </h3>
    //                                 <p>Duration: {leg.actualDurationInMinutes} minutes</p>
    //                                 <p>Train: {leg.name || "No train name available"}</p>
    //                                 <p>Stops:</p>
    //                                 <ul className={styles.stopList}>
    //                                     {leg.stops.map((stop, stopIndex) => (
    //                                         <li key={stopIndex} className={styles.stopItem}>
    //                                             {stop.name} (Lat: {stop.lat}, Lng: {stop.lng})
    //                                         </li>
    //                                     ))}
    //                                 </ul>
    //                             </div>
    //                         ))}
    //                     </TimelineContent>
    //                 </TimelineItem>
    //             ))}
    //         </Timeline>
    //     </div>
    // </div>






    )
};

export default ScheduleTimeline;