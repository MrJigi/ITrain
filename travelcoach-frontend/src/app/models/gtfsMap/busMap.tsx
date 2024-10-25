"use client"; // This tells Next.js to treat this as a Client Component


import React, { useState, useEffect } from 'react';
import Papa from 'papaparse';
// import {fetch} from "undici-types";

const  GTFSParser = ( ) => {
    // const [routes, setRoutes] = useState([]);
    // const [stops, setStops] = useState([]);

    const [routes, setRoutes] = useState([]);
    const [stops, setStops] = useState([]);
    const [agency, setAgency] = useState([]);
    const [calendar, setCalendar] = useState([]);
    const [calendarDates, setCalendarDates] = useState([]);
    const [feedInfo, setFeedInfo] = useState([]);
    const [shapes, setShapes] = useState([]);
    const [stopTimes, setStopTimes] = useState([]);
    const [transfers, setTransfers] = useState([]);
    const [trips, setTrips] = useState([]);

    // const GTFSAgency = require('../../nlBusData/GTFS/agency.txt');
    // const GTFSCalendar = require('../../nlBusData/GTFS/calendar.txt');
    // const GTFSCalendarDates = require('../../nlBusData/GTFS/calendar_dates.txt');
    // const GTFSFeedInfo = require('../../nlBusData/GTFS/feed_info.txt');
    // const GTFSRoutes = require('../../nlBusData/GTFS/routes.txt')
    // const GTFSShapes = require('../../nlBusData/GTFS/shapes.txt');
    // const GTFSStopTime = require('../../nlBusData/GTFS/stop_times.txt');
    // const GTFSStops = require('../../nlBusData/GTFS/stops.txt');
    // const GTFSTransfers = require('../../nlBusData/GTFS/transfers.txt');
    // const GTFSTrips = require('../../nlBusData/GTFS/trips.txt');



    // const parseGTFSFile = (filePath, setData) => {
    //     fetch(filePath)
    //         .then((response) => response.text())
    //         .then((csvData) => {
    //             Papa.parse(csvData, {
    //                 header: true, // if the file has a header
    //                 complete: (results) => {
    //                     setData(results.data);
    //                 },
    //             });
    //         })
    //         .catch((error) => console.error(`Error fetching ${filePath}: `, error));
    // };


    useEffect(() => {
        // Fetch and parse all GTFS files when the component mounts
        // parseGTFSFile(GTFSAgency, setAgency);
        // parseGTFSFile(GTFSCalendar, setCalendar);
        // parseGTFSFile(GTFSCalendarDates, setCalendarDates);
        // parseGTFSFile(GTFSFeedInfo, setFeedInfo);
        // parseGTFSFile(GTFSRoutes, setRoutes);
        // parseGTFSFile(GTFSShapes, setShapes);
        // parseGTFSFile(GTFSStopTime, setStopTimes);
        // parseGTFSFile(GTFSStops, setStops);
        // parseGTFSFile(GTFSTransfers, setTransfers);
        // parseGTFSFile(GTFSTrips, setTrips);
    }, []);
    return (
        <div>
            <h1>GTFS Data</h1>
            <h2>Routes</h2>
            {/*<ul>*/}
            {/*    {routes.map((route) => (*/}
            {/*        <li key={route.route_id}>*/}
            {/*            {route.route_long_name} ({route.route_short_name})*/}
            {/*        </li>*/}
            {/*    ))}*/}
            {/*</ul>*/}

        {/*    <h2>Stops</h2>*/}
        {/*    <ul>*/}
        {/*        {stops.map((stop) => (*/}
        {/*            <li key={stop.stop_id}>*/}
        {/*                {stop.stop_name} ({stop.stop_lat}, {stop.stop_lon})*/}
        {/*            </li>*/}
        {/*        ))}*/}
        {/*    </ul>*/}
        </div>
    );

};
export default GTFSParser;



