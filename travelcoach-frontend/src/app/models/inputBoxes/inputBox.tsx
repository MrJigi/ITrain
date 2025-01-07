import styles from "./inputbox.module.css";
import React, {useEffect, useState} from "react";
import logoType from "../../img/exchange.png";
import Image from "next/image";
import {Button} from "react-bootstrap";
// import Button from 'react-bootstrap';
import propTypes from "prop-types";

// notifications disturbance
import Badge from '@mui/material/Badge';
import Stack from '@mui/material/Stack';
import AccessTimeIcon from '@mui/icons-material/AccessTime';
// import MailIcon from '@mui/icons-material/Mail';
import RailwayAlertIcon from '@mui/icons-material/RailwayAlert';
import { DateTimePicker } from '@mui/x-date-pickers/DateTimePicker';


// dates
import dayjs from 'dayjs';
import utc from 'dayjs/plugin/utc';
import timezone from 'dayjs/plugin/timezone';

// Alert Disruptions
// import Button from '@mui/material/Button';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';
//
import Schedule from "@/app/models/schedule/schedule";

import { DemoContainer } from '@mui/x-date-pickers/internals/demo';
import { LocalizationProvider } from '@mui/x-date-pickers/LocalizationProvider';
import { AdapterDayjs } from '@mui/x-date-pickers/AdapterDayjs';
import { DatePicker } from '@mui/x-date-pickers/DatePicker';
import {red} from "@mui/material/colors";
import PropTypes from "prop-types";
import {white} from "yoctocolors";
import DisturbanceBox from "@/app/models/disturbanceBox/disturbanceBox";

export default function InputBox({startStation,endStation,startTime,setStartStation,setEndStation,setStartTime,onSubmit}){

    // const [fromStation, setFromStation] = useState("");
    // const [toStation, setToStation] = useState("");
    // const [departureTime, setDepartureTime] = useState("");

    //Enter Submission info
    // const [startInput, setStartInput] = useState('');
    // const [endInput, setEndInput] = useState('');

    const [scheduleData, setScheduleData] = useState(null);

    // const [scheduleData, setScheduleData] = useState(null);
    // From disturbanceBox
    const [isActive, setIsActive] = useState(false);
    const [disturbances, setDisturbances] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const [badgeContent, setBadgeContent] = useState(0); // Manage badge content



    const travelData = {
        startStation,
        endStation,
        startTime
    }

    const handleFormSubmit = (e) => {
        console.log("FORM SUBMITTED:", {e, startStation, endStation });

        e.preventDefault();
        onSubmit(e);
    };

    ///DayJS
    dayjs.extend(utc);
    dayjs.extend(timezone);
    const [selectedDate, setSelectedDate] = useState(null);

    ///Alert
    const [open, setOpen] = React.useState(false);
    const handleClickOpen = () => {
        fetchDisturbances();
        setOpen(true);
    };

    // const [scheduleData, setScheduleData] = useState(null);

    const handleClose = () => {
        setOpen(false);
    };

    //prepare data submission
    const handleSubmit = () => {
        console.log("Submit pressed with:", { startStation, endStation });
        setStartStation(startStation);
        setEndStation(endStation);
    };


    // prepare ScheduleData
    // const handlePlanTrip = () => {
    //     const data = {
    //         fromStation,
    //         toStation,
    //         departureTime,
    //         timestamp: new Date().getTime()
    // };
    //     console.log("Planning trip with:", { fromStation, toStation, departureTime });
    //     updateScheduleData(data); // Use the renamed prop
    //     // setFromStation('');
    //     // setToStation('');
    //     // setDepartureTime('');
    // }

    // const [endStation,setEndStation]=useState("");
    const [departureTime, setDepartureTime]= useState("");

    const handleStartStationChange = (e) => {
        setStartStation(e.target.value); // Update parent state
    };

    const handleEndStationChange = (e) => {
        setEndStation(e.target.value); // Update parent state
    };

    const handleStartTimeChange = (e) => {
        setStartTime(e.target.value); // Update parent state
    };

    // const updateBadgeNumber = (newNumber) => {
    //     setBadgeContent(newNumber);
    // };

    // const handleFromChange = (e) => setToStation(e.target.value);
    // const handleToChange = (e) => setFromStation(e.target.value);
    // const handleTimeChange =(e)=> setT
    // const handleDateChange = (e) => setDepartureTime(e.target.value);



    // const handleFromChange = (e) =>{
    //   const value = e.target.value;
    //   setFromStation(value);
    //   setStartStation(value);
    //   setEndStation(value);
    //   setBadgeContent(value);
    // };




    // const handleStationEndChange = (e) => {
    //     const value = e.target.value;
    //     setEndStation(value);
    //
    // }

    //Call Disturbance Dialog Fetch

    async function fetchDisturbances() {
        console.log("station =>"+startStation+" Departure time => " + startTime);
        if (!startStation || !startTime) {
            console.error('Start station or time is not set.');
            return;
        }

        try {
            const response = await fetch(
                `http://localhost:8080/api/disruption/getDisruptionsForTimeframe?startStation=${startStation}&startDateTime=${startTime}`
            );

            if (!response.ok) {
                throw new Error('Network response was not ok');
            }

            const data = await response.json();
            setDisturbances(data);
            setLoading(false);
        } catch (error) {
            console.error('Error fetching disturbances:', error);
            setError(error);
            setLoading(false);
        }
    }



    ///Call on Disturbances all

    // async function fetchDisturbances() {
    //     try {
    //         // http://localhost:8080/api/disruption/getDisruptionsForTimeframe?startStation=Venlo&startDateTime=2024-11-08T11:23:46+0100
    //         const response = await fetch('http://localhost:8080/api/disruption/getDisruptionsForTimeframe?startStation='+startStation+'&startDateTime='+startTime);
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

    // Date picker

        // const [selectedDate, setSelectedDate] = useState(null);

        const handleDateChange = (newDate) => {
            if (newDate) {
                // Format the date to the desired format: 2024-11-18T11:23:46+0100
                const formattedDate = dayjs(newDate).format('YYYY-MM-DDTHH:mm:ssZ');
                setSelectedDate(newDate);
                setDepartureTime(formattedDate);
                setDepartureTime(formattedDate); // Pass the formatted date to the parent
                console.log('Formatted Date:', formattedDate);
            }
        };


    // Set time as Current time now
    const setCurrentTime = () => {
        // Get the current date and time
        const now = new Date();

        // Get the local time offset in minutes and convert it to a time zone string (e.g., "+0100")
        const timeZoneOffset = -now.getTimezoneOffset();
        const sign = timeZoneOffset >= 0 ? "+" : "-";
        const hours = String(Math.abs(Math.floor(timeZoneOffset / 60))).padStart(2, "0");
        const minutes = String(Math.abs(timeZoneOffset % 60)).padStart(2, "0");
        const timeZone = `${sign}${hours}${minutes}`;

        // Format the current time to match the desired format
        const formattedTime = now.toISOString().slice(0, 19) + timeZone;

        // Set the startTime state
        setDepartureTime(formattedTime);
    };



    //call all method
    function allDisturbancesNumber(disturbances) {
        const filteredResults = disturbances.filter(disturbance => {
            // Apply filtering logic here
            return disturbance; // Modify this condition to filter based on your criteria
        });
        return filteredResults.length;
    }


    // function allDisturbancesNumber(disturbances) {
    //     console.log("amount of disturbances"+disturbances)
    //     const filteredResults = disturbances.filter(disturbance => {
    //         // Parse the start time of the disturbance
    //         // const isWithinTimeFrame = startTime >= disturbanceStart;
    //         // console.log(`Checking time for disturbance ${disturbance.title}: ${isWithinTimeFrame}`);
    //         console.log("testMethod"+disturbance)
    //         // Return true if it meets the condition to be included in the filtered list
    //         return disturbances;
    //     });
    //     console.log("testMethod2"+filteredResults.length)
    //     // Return the count of disturbances
    //     return filteredResults.length;
    // }



    // end of disturbance


    //
    // const handleTimeChange = (e) => {
    //     const value = e.target.value;
    //     setDepartureTime(value);
    //     // setDepartureTime(value); // Update parent state
    //
    // };

    useEffect(() => {

        if (scheduleData) {
            console.log("Schedule data updated:", scheduleData);
            // Perform trip planning logic here
        }
    }, [disturbances,scheduleData]);


    return(
        <form onSubmit={handleFormSubmit}>
        <div className={styles.inputWrapper}>

            {/*<div className={styles.card}>*/}
            {/*<h2>*/}
            {/*    <svg className="icon" aria-hidden="true">*/}
            {/*        /!*<use xlink:href="#icon-coffee" href="#icon-coffee"/>*!/*/}
            {/*    </svg>*/}
            {/*    Regular*/}
            {/*</h2>*/}
            <div className={styles.input_group_wrapper}>
                {/*From station input */}
                <div className={styles.form__group}>
                    <input type="text"
                           className={styles.form__field}
                           placeholder="Name"
                           name="from"
                           id='from'
                        // value={startStation}
                           onChange={handleStartStationChange}
                           required/>
                    <label htmlFor="from" className={styles.form__label}>From</label>
                </div>

                <div className={styles.inputExchangeField}>
                    <Button className={styles.switchButton}>
                        <Image className={styles.exchangePic}
                               src={logoType}
                               alt={"exchange icon"}>

                        </Image>
                    </Button>
                </div>
                {/* To station input */}
                <div className={styles.form__group}>
                    <input type="text"
                           className={styles.form__field}
                           placeholder="Name"
                        // value={endStation}
                           name="to"
                           onChange={handleEndStationChange}
                           id='to'
                           required/>
                    <label htmlFor="to" className={styles.form__label}>To</label>
                </div>
            </div>

            <div className={styles.additionalOptions}>
                <div className={styles.optionButton}>
                    <Button style={{backgroundColor: "transparent", border: "none"}} onClick={handleClickOpen}
                            direction="row">
                        <Badge badgeContent={badgeContent} color="error">
                            <RailwayAlertIcon color="action"/>
                            Disruptions
                        </Badge>

                    </Button>
                    <Dialog
                        open={open}
                        onClose={handleClose}
                        aria-labelledby="alert-dialog-title"
                        aria-describedby="alert-dialog-description"
                    >
                        <DialogTitle id="alert-dialog-title">
                            {"Disruption areas"}
                        </DialogTitle>
                        <DialogContent>
                            <DisturbanceBox startStation={startStation} updateBadgeNumber={setBadgeContent}
                                            endStation={endStation} startTime={startTime}></DisturbanceBox>
                        </DialogContent>

                        <DialogActions>
                            {/*<Button onClick={handleClose}>Disagree</Button>*/}
                            <Button onClick={handleClose} autoFocus> Close</Button>
                        </DialogActions>
                    </Dialog>
                </div>
                {/*Add buttons for options*/}
                {/*<div className={styles.optionButton}>*/}
                {/*    <Button></Button>*/}
                {/*    <label className={styles.buttonLabel}> Departure</label>*/}
                {/*</div>*/}

                {/*<div className={styles.optionButton}>*/}
                {/*    <Button></Button>*/}
                {/*    <label className={styles.buttonLabel}> Arrival</label>*/}
                {/*</div>*/}


                <div className={styles.optionButton}>
                    <LocalizationProvider dateAdapter={AdapterDayjs}>
                        <DateTimePicker
                            label="Select Date and Time"
                            value={selectedDate}
                            onChange={handleDateChange}
                            // renderInput={(params) => <TextField {...params} />}
                            ampm={false} // Use 24-hour format
                        />
                    </LocalizationProvider>
                    <Button style={{backgroundColor: "transparent", border: "none"}} onClick={setCurrentTime}> set time now</Button>

                    {/*<label className={styles.buttonLabel}> Date Picker</label>*/}
                </div>


                <div style={{width: "6rem"}} className={styles.optionButton}>

                    <Button style={{backgroundColor: "transparent", border: "none" ,width:"100%", height:"100%"}} type={"submit"} onClick={handleSubmit}> Plan Trip</Button>
                </div>


                {/*<div className={styles.optionButton}>*/}
                {/*    <Button></Button>*/}
                {/*    <label className={styles.buttonLabel}> Additional options</label>*/}
                {/*</div>*/}

                {/*<div>*/}
                {/*    <LocalizationProvider dateAdapter={AdapterDayjs}>*/}
                {/*        <DemoContainer components={['DatePicker', 'DatePicker']}>*/}
                {/*            <DatePicker label="Uncontrolled picker" defaultValue={dayjs('2022-04-17')} />*/}
                {/*            <DatePicker*/}
                {/*                label="Controlled picker"*/}
                {/*                value={value}*/}
                {/*                onChange={(newValue) => setValue(newValue)}*/}
                {/*            />*/}
                {/*        </DemoContainer>*/}
                {/*    </LocalizationProvider>*/}
                {/*</div>*/}
            </div>


            {/*</div>*/}

            {/*<div className={styles.inputSection}>*/}
            {/*    <div className={styles.searchIcon}/>*/}
            {/*    <label className={styles.inputLabel}> Address</label>*/}
            {/*    <input className={styles.inputSearch} type={"text"} required={true}/>*/}
            {/*</div>*/}

            {/*<div className={styles.inputButton}>*/}

            {/*</div>*/}
            <div className={styles.inputButtonWrap}>
                {/*<Schedule data={travelData}></Schedule>*/}
                {/*<button className={styles.inputButton}>Plan trip</button>*/}
                {/*<button className={styles.inputButton} type="reset">Reset</button>*/}
            </div>
        </div>
        </form>

    )


    InputBox.propTypes = {
        startStation: PropTypes.string.isRequired,
        endStation: PropTypes.string.isRequired,
        startTime: PropTypes.string.isRequired,
        setStartStation: PropTypes.func.isRequired,
        setEndStation: PropTypes.func.isRequired,
        setStartTime: PropTypes.func.isRequired,
        setBadgeContent: PropTypes.func.isRequired,
    };

    //         InputBox.propTypes = {
    //     badgeContent: PropTypes.number,
    //     setStartStation: PropTypes.func.isRequired,
    //     setStartTime: PropTypes.func.isRequired,
    // };
    // // Default props
    // InputBox.defaultProps = {
    //     badgeContent: 0 // Default badge content if not provided
    // };
    //
    };
