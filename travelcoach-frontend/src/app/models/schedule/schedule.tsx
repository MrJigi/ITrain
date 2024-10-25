import styles from "./schedule.module.css";
import {useEffect, useRef, useState} from "react";


export default function Schedule() {
    // const toggleButton = toggleButtonRef.current;
    const [isActive, setIsActive] = useState(false);
    const toggleButtonRef = useRef(null);
    const sidePanelRef = useRef(null);
    useEffect(() => {
        const toggleButton = toggleButtonRef.current;
        const sidePanel = sidePanelRef.current;

        const handleClick = () => {
            setIsActive(prevState => !prevState)
        };

        if (toggleButton && sidePanel){

            document.addEventListener("click", handleClick);
        }

        return () => {
            if (toggleButton){
                document.removeEventListener("click",handleClick);
            }
        };
    },[]);

    return (
        <div className={styles.wrapperWindow}>
            <div className={styles.wrapperGridBox}>



                <ul className={styles.scheduleList}>
                    <li className={styles.scheduleListItem}>
                        <span className={styles.scheduleShortInfo}>
                            Eindhoven to Rotterdam
                        </span>
                        <span> 15:00 - 16:00 </span>
                        <span className={styles.scheduleLongInfo}>
                            Train travels through: Eindhoven, Strijp-s, Best ...
                        </span>
                    </li>

                    <li className={styles.scheduleListItem}>
                        <span className={styles.scheduleShortInfo}>
                            Tilburg to Rotterdam
                        </span>
                        <span> 15:00 - 16:00 </span>
                        <span className={styles.scheduleLongInfo}>
                            Train travels through: Eindhoven, Strijp-s, Best ...
                        </span>
                    </li>

                    <li className={styles.scheduleListItem}>
                        <span className={styles.scheduleShortInfo}>
                            Tilburg to Rotterdam
                        </span>
                        <span> 15:00 - 16:00 </span>
                        <span className={styles.scheduleLongInfo}>
                            Train travels through: Eindhoven, Strijp-s, Best ...
                        </span>
                    </li>

                    <li className={styles.scheduleListItem}>
                        <span className={styles.scheduleShortInfo}>
                            Tilburg to Rotterdam
                        </span>
                        <span> 15:00 - 16:00 </span>
                        <span className={styles.scheduleLongInfo}>
                            Train travels through: Eindhoven, Strijp-s, Best ...
                        </span>
                    </li>


                </ul>

                {/*<div className={styles.scheduleWindow}>*/}
                {/*    <a className={styles.menuLink}>*/}
                {/*    Train to Eindhoven*/}
                {/*    </a>*/}

                {/*</div>*/}


            </div>


            {/*<div className={styles.scheduleStickySideButton}>*/}
            {/*    <button ref={toggleButtonRef} className={styles.toggleButton}>*/}
            {/*        Toggle Panel*/}
            {/*    </button>*/}
            {/*</div>*/}

            {/* Toggle Button */}
            <div>
            <button ref={toggleButtonRef} className={styles.toggleButton}>
                Toggle Panel
            </button>
            </div>
            {/* Side Panel */}
            <div ref={sidePanelRef} className={`${styles.sidePanel} ${isActive ? styles.active : ''}`}>
                <p>This is the side panel content!</p>
            </div>

        </div>

    )
}