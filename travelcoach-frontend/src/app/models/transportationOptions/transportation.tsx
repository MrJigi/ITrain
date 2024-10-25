import styles from "./transportation.module.css";

export default function Transportation(){
    return(
        <div className={styles.componentWrap}>
            <div className={styles.listOfItems}>


                <div className={styles.optionButton}>
                    <div className={styles.transportationIcon}></div>
                    <div>Car</div>
                </div>

                <div className={styles.optionButton}>
                    <div className={styles.transportationIcon}></div>
                    <div>Bus</div>
                </div>

                <div className={styles.optionButton}>
                    <div className={styles.transportationIcon}></div>
                    <div>Train</div>
                </div>

                <div className={styles.optionButton}>
                    <div className={styles.transportationIcon}></div>
                    <div>Electric Car</div>
                </div>

            </div>
        </div>
    )
}