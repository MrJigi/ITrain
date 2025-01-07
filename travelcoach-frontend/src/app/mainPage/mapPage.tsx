"use client"; // This tells Next.js to treat this as a Client Component

import styles from "./mapPage.module.css";
import Schedule from "@/app/models/schedule/schedule";
// import Googlemap from "@/app/models/googleMaps/googlemap";
import Grid2 from '@mui/material/Grid2';
import React, {useEffect, useRef, useState} from "react";
import InputBox from "@/app/models/inputBoxes/inputBox";
// import ChargingStation from "@/app/models/chargingStationMap/chargingStation";
// import Mapoverview from "@/app/models/mapOverview/mapoverview";
import dynamic from 'next/dynamic';
// import DisturbanceBox from "@/app/models/disturbanceBox/disturbanceBox";
// import {Button} from "react-bootstrap";
// import Papa from 'papaparse';

// Drawer containers

// import Drawer from '@mui/material/Drawer';
// import DrawerSchedule from "@/app/models/drawerForSchedule/drawerSchedule";
import { Typography} from "@mui/material";
import Box from "@mui/material/Box";
import ChargingStation from "@/app/models/chargingStationMap/chargingStation.tsx";
// import TripViewer from "@/app/Response&Requests/ReisInformatie/Response/Leg";
// import TripPlanner from "@/app/models/tripPlanner/tripPlan";
// import ScheduleTimeline from "@/app/models/scheduleTimeline/scheduleTimeline";
// import SwaggerDocs from "@/app/models/SwaggerComponent/SwaggerDocs";
// import PropTypes from "prop-types";


export default function MapPage() {
    const [isActive, setIsActive] = useState(false);
    const [startStation, setStartStation] = useState("Eindhoven");
    const [endStation, setEndStation] = useState("Amsterdam Centraal");
    const [startTime, setStartTime] = useState("2024-12-16T12:17:00+0100");
    // const [badgeContent, setBadgeContent] = useState(0);




    // const scheduleData = useMemo(() => {
    //     checkStuff();
    //
    //     return {
    //         startStation,
    //         endStation,
    //         startTime,
    //         setStartStation,
    //         setEndStation,
    //         setStartTime
    //     };
    // }, [startStation, endStation, startTime]);

    // const scheduleData = {
    //     startStation,
    //     endStation,
    //     startTime,
    //     setStartStation,
    //     setEndStation,
    //     setStartTime
    // };


    const [scheduleData, setScheduleData] = useState({
        startStation: "",
        endStation: "",
        startTime: "",
    });
    const [isSubmitted, setIsSubmitted] = useState(false); // Track form submission

    const handleSubmit = (e: { preventDefault: () => void; }) => {
        setIsSubmitted(false); // Trigger the Schedule component to render
        e.preventDefault(); // Prevent default form behavior
        setScheduleData({
            startStation,
            endStation,
            startTime,
        }); // Update state with trip data
        // setIsSubmitted(true); // Trigger the Schedule component to render
    };
    setTimeout(() => {
        setIsSubmitted(true);
    }, 0);


    function checkStuff(){
        console.log(` startStation, ${startStation}
` +
            `            endStation, ${endStation}
` +
            `            startTime, ${startTime}
` +
            `            setStartStation, ${setStartStation}
` +
            `            setEndStation,${setEndStation}
` +
            `            setStartTime ${setStartTime}`)

    }
    // const [scheduleData, setScheduleData] = useState(null);

// Step counter ------------------------------------
//     Create refs for the button and side panel
    const toggleButtonRef = useRef(null);
    const sidePanelRef = useRef(null);

    // need to import the ChargingStation this way to allow dynamic import to provide the window and document properties
    // as these objects only exist in the browser

    const ChargingStationRef = dynamic(() =>  import('@/app/models/chargingStationMap/chargingStation.tsx'), {ssr: false});

    useEffect(() => {
        checkStuff()
        const toggleButton = toggleButtonRef.current;
        const sidePanel = sidePanelRef.current;
        console.log('FROM MAP PAGE startStation='+startStation+'setEndStation='+endStation+'setTime='+startTime);

        const handleClick = () => {
            setIsActive(prevState => !prevState);
        };



        if (toggleButton && sidePanel) {

            document.addEventListener("click", handleClick);
        }
        // Cleanup the event listener on unmount
        return () => {
            if (toggleButton) {
                document.removeEventListener("click", handleClick);
            }
        };
    }, [startStation, endStation, startTime]);

    return (
        <div className={styles.wrapperPanel}>

            <Box>
                {/* Top panel*/}


                <Grid2 size={12}  className={`${styles.fulWidthPanel} ${isActive} ? styles.active : styles.inactive` }>
                    {/*<Typography>Disturbance box</Typography>*/}
                    {/*<DisturbanceBox startStation={startStation} startTime={startTime}/>*/}

                    {/*<DisturbanceBox startStation={startStation} endStation={endStation} startTime={startTime}></DisturbanceBox>*/}
                    {/*<Typography>Input box</Typography>*/}
                    <InputBox startStation={startStation} endStation={endStation} startTime={startTime}  setStartStation={setStartStation} setStartTime={setStartTime}
                              setEndStation={setEndStation} onSubmit={handleSubmit} />
                </Grid2>
                <Grid2 spacing={2}>
                    <Grid2 size={4}>
                        {/* Main Panel - Map Component */}
                        <Grid2 size={8} className={styles.mainPanel}>
                            {/*<div className={styles.stickyPanel}>Im sticking</div>*/}
                            {/*<Mapoverview></Mapoverview>*/}
                            <ChargingStationRef></ChargingStationRef>
                            {/*<ChargingStationRef/>*/}
                        </Grid2>
                        <Grid2 className={styles.sidePanel}>

                            {/*<TripPlanner></TripPlanner>*/}
                            <h1>Transportation Component</h1>

                            {isSubmitted && <Schedule data={scheduleData} />}

                            {/*<SwaggerDocs/>*/}
                            {/*<ScheduleTimeline/>*/}
                        </Grid2>
                    </Grid2>
                </Grid2>
            </Box>
        </div>

    );

    // InputBox.PropTypes = {
    //     startStation: PropTypes.string.isRequired,
    //     endStation: PropTypes.string.isRequired,
    //     setStartStation: PropTypes.func.isRequired,
    //     setEndStation: PropTypes.func.isRequired,
    // };
}