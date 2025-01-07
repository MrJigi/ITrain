import React, {useEffect, useState} from "react";
import Schedule from "@/app/models/schedule/schedule";
import PropTypes from 'prop-types';
import styles from "@/app/models/schedule/schedule.module.css";
// import {detectOverflow} from "@popperjs/core";
import LoadingIo from "@/app/models/loadingFile/loadingIo";
import Dialog from "@mui/material/Dialog";
import DialogTitle from "@mui/material/DialogTitle";
// import ScheduleTimeline from "@/app/models/scheduleTimeline/scheduleTimeline";
import DialogContent from "@mui/material/DialogContent";
import DialogActions from "@mui/material/DialogActions";
import {Button} from "react-bootstrap";

export default function DisturbanceBox({startStation,endStation,startTime,updateBadgeNumber}) {

    // const [isActive, setIsActive] = useState(false);
    const [disturbances, setDisturbances] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    // const [filteringDisturbances, setFilteringDisturbances] = useState([]);

    const [localStartStation, setLocalStartStation] = useState('Venlo');
    const [localEndStation, setLocalEndStation] = useState('Utrecht');
    const [localStartTime, setLocalStartTime] = useState('2024-11-08T11:23:46+0100');
    const [open, setOpen] = React.useState(false);
    const [selectedSchedule, setSelectedSchedule] = useState([]); // Track selected schedule

    const handleClose = (event) => {
        event.stopPropagation();
        setOpen(false);
    };

    const handleClickOpen = (schedule) => {
        // console.log(travelPlan);
        console.log(schedule);
        setSelectedSchedule(schedule);
        // console.log("selected Schedule"+JSON.stringify(selectedSchedule, null, 2));
        // fetchDisturbances();
        // Need a fetch method to show the legs and stops.
        setOpen(true);
    };
    // Cache object to store previously fetched disturbances
    const disturbancesCache = {};

    // async function fetchDisturbances() {
    //     try {
    //         // http://localhost:8080/api/disruption/getDisruptionsForTimeframe?startStation=Venlo&startDateTime=2024-11-08T11:23:46+0100
    //         const response = await fetch('http://localhost:8080/api/disruption/getDisruptionsForTimeframe?startStation='+localStartStation+'&startDateTime='+localStartTime);
    //         if (!response.ok) {
    //             throw new Error('Network response issue');
    //         }
    //         const data = await response.json();
    //         console.log("Fetched Disturbances:", data);  // Log the fetched data to verify
    //         setDisturbances(data);
    //         setLoading(false);
    //         return data;
    //     } catch (error) {
    //         console.error('Error fetching disturbances:', error);
    //         setError(error);
    //         setLoading(false);
    //     }
    // }
    async function fetchDisturbances() {
        // Generate a unique cache key based on startStation and startTime
        const cacheKey = `${startStation}-${startTime}`;

        // Check if the disturbances for this cache key already exist
        if (disturbancesCache[cacheKey]) {
            console.log('Using cached disturbances:', disturbancesCache[cacheKey]);
            setDisturbances(disturbancesCache[cacheKey]);
            setLoading(false);
            return;
        }

        try {
            // Make the API call if not cached
            const response = await fetch('http://localhost:8080/api/disruption/getDisruptionsForTimeframe?startStation=' + startStation + '&startDateTime=' + startTime);
            if (!response.ok) {
                throw new Error('Network response issue');
            }

            const data = await response.json();
            console.log("Fetched Disturbances:", data);  // Log the fetched data to verify

            // Store the fetched data in the cache
            disturbancesCache[cacheKey] = data;

            // Update the state with the fetched data
            setDisturbances(data);
            setLoading(false);
            return data;
        } catch (error) {
            console.error('Error fetching disturbances:', error);
            setError(error);
            setLoading(false);
        }
    }

    useEffect(() => {
        if (disturbances.length > 0) {
            // Call the function passed as a prop to update the badge number in InputBox
            console.log("disturbance NR" + filterDisturbances.length)
            updateBadgeNumber(filterDisturbances.length);
        }

        if (startStation) setLocalStartStation(startStation);
        if (endStation) setLocalEndStation(endStation);
        if (startTime) setLocalStartTime(startTime);
        fetchDisturbances();
    }, [startStation, endStation, startTime,selectedSchedule ]);  // Depend on the props to update the local state


    // useEffect(() => {
    //     if(startStation&&endStation) {
    //     fetchDisturbances();
    //     }
    // }, [startStation,endStation]);


    function allDisturbancesNumber(disturbances, disturbanceStart) {
        const filteredResults = disturbances.filter(disturbance => {
            // Parse the start time of the disturbance
            const isWithinTimeFrame = startTime >= disturbanceStart;
            console.log(`Checking time for disturbance ${disturbance.title}: ${isWithinTimeFrame}`);

            // Return true if it meets the condition to be included in the filtered list
            return isWithinTimeFrame;
        });

        // Return the count of disturbances
        return filteredResults.length;
    }

    function filterDisturbances(disturbances:any, startStation:any,endStation:any) {
        return disturbances.filter(disturbance => {
            // Parse the start and end times of the disturbance
            // const disturbanceStart = new Date(disturbance.start);
            // const disturbanceEnd = new Date(disturbance.end);
            // const userStartTime = new Date(startTime);

            // Check if the provided start time falls within the disturbance period
            // const isWithinTimeFrame = userStartTime >= disturbanceStart && userStartTime <= disturbanceEnd;

            // Check if the provided station matches any station in the disturbance (partial match)
            const hasStation = (disturbance.publicationSections || []).some(section =>
                section.section.stations.some(station =>
                    station.name.toLowerCase().includes(startStation.toLowerCase()) || // Partial match (case-insensitive)
                    station.name.toLowerCase().includes(endStation.toLowerCase())
                )
            );
            updateBadgeNumber(filterDisturbances.length);
            return  hasStation;
        });
    }

    // function filterDisturbances(disturbances, localStartStation, localEndStation,localStartTime ) {
    //     return disturbances.filter(disturbance => {
    //         // Parse the start and end times of the disturbance
    //         // const disturbanceStart = new Date(disturbance.start);
    //         // const disturbanceEnd = new Date(disturbance.end);
    //         // const userStartTime = new Date(startTime);
    //
    //         // Check if the provided start time falls within the disturbance period
    //         // const isWithinTimeFrame = userStartTime >= disturbanceStart && userStartTime <= disturbanceEnd;
    //
    //         // Check if the provided station matches any station in the titleSections
    //         const hasStationInTitleSections = (disturbance.titleSections || []).some(sectionArray =>
    //             sectionArray.some(section =>
    //                 section.type === 'STATION' &&
    //                 (section.value.toLowerCase() === localStartStation.toLowerCase() ||
    //                     section.value.toLowerCase() === localEndStation.toLowerCase())
    //             )
    //         );
    //
    //         // Return true if both conditions are satisfied
    //         return hasStationInTitleSections;
    //     });
    // }

    //
    // function filterDisturbances(disturbances, startStation, startTime) {
    //     return disturbances.filter(disturbance => {
    //         // Parse the start and end times of the disturbance
    //         const disturbanceStart = new Date(disturbance.start);
    //         const disturbanceEnd = new Date(disturbance.end);
    //         const userStartTime = new Date(startTime);
    //
    //
    //         // Check if the provided start time falls within the disturbance period
    //         // const isWithinTimeFrame = userStartTime >= disturbanceStart && userStartTime <= disturbanceEnd;
    //
    //
    //         // console.log(`Checking time for disturbance ${disturbance.title}: ${isWithinTimeFrame}`);
    //         // Check if the provided station matches any station in the disturbance
    //         const hasStation = (disturbance.publicationSections || []).some(section =>
    //             section.section.stations.some(station => station.name.toLowerCase() === startStation.toLowerCase())
    //         );
    //         console.log(`Checking station for disturbance ${disturbance.title}: ${hasStation}`);
    //
    //         return hasStation;
    //         // return isWithinTimeFrame && hasStation;
    //     });
    // }

    const filteredDisturbances = filterDisturbances(disturbances, startStation,endStation,);
    // console.log("Filtered Disturbances:", filteredDisturbances);  // Log after filtering
// Render logic
    if (loading) {
        return <LoadingIo/>;
    }

    // if (error) {
    //     return <div>Error: {error.message}</div>;
    // }

    return (
        <div>

            <div className={styles.wrapperWindow}>
                <div className={styles.wrapperGridBox}>

                    {filteredDisturbances.length > 0 ? (
                    <ul className={styles.scheduleList}>
                        {filteredDisturbances?.map((disturbance, index) => (
                            <li onClick={() => handleClickOpen(disturbance)} key={index} className={styles.scheduleListItem}>
                                <span className={styles.scheduleShortInfo}>
                                 <p style={{color: "#ff6347 "}}>
                                <strong color="Red">Disruption:</strong> {disturbance.type}

                                </p>
                                    <br/>

                                              <Dialog
                                                  open={open}
                                                  onClose={handleClose}
                                                  aria-labelledby="alert-dialog-title"
                                                  aria-describedby="alert-dialog-description"
                                              >
                        <DialogTitle id="alert-dialog-title">

                            {/*<ScheduleTimeline travelPlan={[filteredDisturbances]}/>*/}
                        </DialogTitle>
                        <DialogContent>
                             {/*Iterate through publicationSections -> section -> stations*/}
                            <strong>Affected Stations:</strong>
                            {disturbance.publicationSections &&
                                disturbance.publicationSections.map((section, sectionIndex) => (
                                    <div key={sectionIndex}>
                                        {section.section?.stations &&
                                            section.section.stations.map((station, stationIndex) => (
                                                <p key={stationIndex}>
                                                    - {station.name}
                                                </p>
                                            ))}
                                    </div>
                                ))}

                        </DialogContent>
                        <DialogActions>

                            <Button onClick={handleClose} autoFocus>
                                Agree
                            </Button>
                        </DialogActions>
                    </Dialog>

                                    {/* Iterate through publicationSections -> section -> stations */}
                                    {/*<strong>Affected Stations:</strong>*/}
                                    {/*{disturbance.publicationSections &&*/}
                                    {/*    disturbance.publicationSections.map((section, sectionIndex) => (*/}
                                    {/*        <div key={sectionIndex}>*/}
                                    {/*            {section.section?.stations &&*/}
                                    {/*                section.section.stations.map((station, stationIndex) => (*/}
                                    {/*                    <p key={stationIndex}>*/}
                                    {/*                        - {station.name}*/}
                                    {/*                    </p>*/}
                                    {/*                ))}*/}
                                    {/*        </div>*/}
                                    {/*    ))}*/}
                                    <br />

                <p style={{ overflow: "hidden" }}>
                    <strong>Issues at:</strong> {disturbance.title}
                </p>

                                    <br/>
                            <strong>Start:</strong> {new Date(disturbance.start).toLocaleString()}
                              <br/>
                            <strong>End:</strong> {new Date(disturbance.end).toLocaleString()}
                            </span>

                            </li>
                        ))}


                    </ul>
                    ) : (
                        <div>No disruptions found.</div>
                    )}
                    </div>
                )
                    </div>


            {/* Render station details */}

            {/*{disturbance.publicationSections.map((section, sectionIndex) => (*/}
            {/*    <div key={sectionIndex}>*/}
            {/*        <h4>Section {sectionIndex + 1}</h4>*/}
            {/*        <div>*/}
            {/*            {section.section.stations.map((station, stationIndex) => (*/}
            {/*                <p key={stationIndex}>*/}
            {/*                    <strong>Name:</strong> {station.name} <br />*/}
            {/*                    <strong>Station Code:</strong> {station.stationCode} <br />*/}
            {/*                    <strong>UIC Code:</strong> {station.uicCode} <br />*/}
            {/*                    <strong>Coordinates:</strong> Lat: {station.coordinate.lat}, Lng: {station.coordinate.lng}*/}
            {/*                </p>*/}
            {/*            ))}*/}
            {/*        </div>*/}
            {/*    </div>*/}
            {/*))}*/}

            {/*Use this section to describe the issue type*/}
            {/*<span className={styles.scheduleLongInfo}>*/}
            {/*Train travels through: Eindhoven, Strijp-s, Best ...*/}
            {/*</span>*/}





                    {/*Test area item */}
                    {/*<h2>Schedule for {startStation} at {startTime}</h2>*/}
                    {/*{filteredDisturbances.length > 0 ? (*/}
                    {/*    <ul>*/}
                    {/*        {filteredDisturbances.map((disturbance, index) => (*/}
                    {/*            <li key={index}>*/}
                    {/*                <strong>Disruption:</strong> {disturbance.description}*/}
                    {/*                <br/>*/}
                    {/*                <strong>Start:</strong> {new Date(disturbance.start).toLocaleString()}*/}
                    {/*                <br/>*/}
                    {/*                <strong>End:</strong> {new Date(disturbance.end).toLocaleString()}*/}
                    {/*            </li>*/}
                    {/*        ))}*/}
                    {/*    </ul>*/}
                    {/*) : (*/}
                    {/*    <div>No disruptions found.</div>*/}
                    {/*)}*/}
                </div>
                )

                Schedule.propTypes = {
                startStation: PropTypes.string.isRequired,
                    endStation: PropTypes.string.isRequired,
                startTime: PropTypes.string.isRequired,
            };
                }