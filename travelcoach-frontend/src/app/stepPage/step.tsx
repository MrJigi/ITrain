"use client"; // This tells Next.js to treat this as a Client Component

import React, {useState} from "react";
import styles from "./step.module.css";


export default function StepPage() {

    const [currentStep, setCurrentStep] = useState(1);
    const [completed, setCompleted] = useState(false);


    const nextStep = () => {
        setCurrentStep((prevStep) => (prevStep < 3 ? prevStep + 1: prevStep));
    };

    const prevStep = () => {
        setCurrentStep((prevStep) => (prevStep > 1 ? prevStep - 1 : prevStep));
    };

    const completeSteps = () => {
        setCompleted(true);
    };

    return(
            <div className={styles.container}>
                <div className={styles.stickySlider}>
                    <ul>
                        <li><button onClick={()=> setCurrentStep(1)}>Step 1</button></li>
                        <li><button  onClick={()=> setCurrentStep(2)}>Step 2</button></li>
                        <li><button  onClick={()=> setCurrentStep(3)}>Step 3</button></li>
                    </ul>
                </div>

                <div className={styles.content}>

                    {currentStep === 1 && (
                        <div className={styles.step}>
                            <h2>Step 1</h2>
                            <input type="text" placeholder="Enter Step 1 data" />
                            <button onClick={nextStep}>Next</button>
                        </div>)}


                    {currentStep === 2 && (
                        <div className={styles.step}>
                            <h2>Step 2</h2>
                            <input type="text" placeholder="Enter Step 2 data" />
                            <button onClick={prevStep}>Previous</button>
                            <button onClick={nextStep}>Next</button>
                        </div>
                    )}


                    {currentStep === 3 && (
                        <div className={styles.step}>
                            <h2>Step 3</h2>
                            <input type="text" placeholder="Enter Step 3 data" />
                            <button onClick={prevStep}>Previous</button>
                            <button onClick={completeSteps}>Submit</button>
                        </div>
                    )}

                    {completed && (
                        <div id={styles.map} className={styles.map}>
                            <h2>Map Display</h2>
                            {/* Here, you would initialize and display the map, e.g., using Mapbox or Google Maps */}
                            <p>Map would appear here.</p>
                        </div>
                    )}
                </div>
            </div>
         );
}