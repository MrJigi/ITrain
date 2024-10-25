"use client"; // This tells Next.js to treat this as a Client Component

import styles from "./mapPage.module.css";
import Schedule from "@/app/models/schedule/schedule";
// import Googlemap from "@/app/models/googleMaps/googlemap";

import React, {useEffect, useRef, useState} from "react";
import InputBox from "@/app/models/inputBoxes/inputBox";
import ChargingStation from "@/app/models/chargingStationMap/chargingStation";
// import Mapoverview from "@/app/models/mapOverview/mapoverview";
import dynamic from 'next/dynamic';
// import Papa from 'papaparse';




export default function MapPage() {
    const [isActive, setIsActive] = useState(false);

    //
    // // Step counter ------------------------------------
    // const [currentStep, setCurrentStep] = useState(1);
    // const [completed, setCompleted] = useState(false);
    //
    //
    // const nextStep = () => {
    //     setCurrentStep((prevStep) => (prevStep < 3 ? prevStep + 1: prevStep));
    // };
    //
    // const prevStep = () => {
    //     setCurrentStep((prevStep) => (prevStep > 1 ? prevStep - 1 : prevStep));
    // };
    //
    // const completeSteps = () => {
    //     setCompleted(true);
    // };
// Step counter ------------------------------------
//     Create refs for the button and side panel
    const toggleButtonRef = useRef(null);
    const sidePanelRef = useRef(null);

    const ChargingStationRef = dynamic(() => import('../..//app/models/chargingStationMap/chargingStation.tsx'), {ssr:false});

    useEffect(() => {
        const toggleButton = toggleButtonRef.current;
        const sidePanel = sidePanelRef.current;

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
    }, []);


    return (
        <div className={styles.wrapperPanel}>



            <InputBox/>
            <div
                ref={sidePanelRef}
                className={`${styles.sidePanel} ${isActive ? styles.active : ""}`}>


                <h1>Transportation Component</h1>
                <Schedule/>

            </div>

            <div className={styles.mainPanel}>
                <div className={styles.stickyPanel}>Im sticking</div>
                {/*<Mapoverview></Mapoverview>*/}

                <ChargingStationRef/>
            </div>


            {/*<button ref={toggleButtonRef} className="toggle-button">*/}
            {/*    Toggle Panel*/}
            {/*</button>*/}
        </div>
    );
    //(
    //     <div className={styles.container}>
    //         <div className={styles.stickySlider}>
    //             <ul>
    //                 <li><button onClick={()=> setCurrentStep(1)}>Step 1</button></li>
    //                 <li><button  onClick={()=> setCurrentStep(2)}>Step 2</button></li>
    //                 <li><button  onClick={()=> setCurrentStep(3)}>Step 3</button></li>
    //             </ul>
    //         </div>
    //
    //         <div className={styles.content}>
    //
    //             {currentStep === 1 && (
    //                 <div className={styles.step}>
    //                     <h2>Step 1</h2>
    //                     <input type="text" placeholder="Enter Step 1 data" />
    //                     <button onClick={nextStep}>Next</button>
    //                 </div>)}
    //
    //
    //             {currentStep === 2 && (
    //                 <div className={styles.step}>
    //                     <h2>Step 2</h2>
    //                     <input type="text" placeholder="Enter Step 2 data" />
    //                     <button onClick={prevStep}>Previous</button>
    //                     <button onClick={nextStep}>Next</button>
    //                 </div>
    //             )}
    //
    //
    //             {currentStep === 3 && (
    //                 <div className={styles.step}>
    //                     <h2>Step 3</h2>
    //                     <input type="text" placeholder="Enter Step 3 data" />
    //                     <button onClick={prevStep}>Previous</button>
    //                     <button onClick={completeSteps}>Submit</button>
    //                 </div>
    //             )}
    //
    //             {completed && (
    //                 <div id={styles.map} className={styles.map}>
    //                     <h2>Map Display</h2>
    //                     {/* Here, you would initialize and display the map, e.g., using Mapbox or Google Maps */}
    //                     <p>Map would appear here.</p>
    //                 </div>
    //             )}
    //         </div>
    //     </div>
    // );



}