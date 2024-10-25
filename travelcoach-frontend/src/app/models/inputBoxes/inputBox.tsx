import styles from "./inputbox.module.css";
import React from "react";
import logoType from "../../img/exchange.png";
import Image from "next/image";
import {Button} from "react-bootstrap";
// import Button from 'react-bootstrap';

export default function InputBox(){
    return(
        <div className={styles.inputWrapper}>

            <div className="card">
                {/*<h2>*/}
                {/*    <svg className="icon" aria-hidden="true">*/}
                {/*        /!*<use xlink:href="#icon-coffee" href="#icon-coffee"/>*!/*/}
                {/*    </svg>*/}
                {/*    Regular*/}
                {/*</h2>*/}
                <div className={styles.input_group_wrapper}>
                    <div className={styles.form__group}>
                        <input type="input" className={styles.form__field} placeholder="Name" name="name" id='name'
                               required/>
                        <label htmlFor="name" className={styles.form__label}>From</label>
                    </div>

                    <div className={styles.inputExchangeField}>
                        <Button className={styles.switchButton}>
                            <Image className={styles.exchangePic} src={logoType} alt={"image of "}>

                            </Image>
                        </Button>
                    </div>
                    <div className={styles.form__group}>
                        <input type="input" className={styles.form__field} placeholder="Name" name="name" id='name'
                               required/>
                        <label htmlFor="name" className={styles.form__label}>To</label>
                    </div>
                </div>

                <div className={styles.additionalOptions}>
                    <div className={styles.optionButton}>
                        <Button></Button>
                        <label className={styles.buttonLabel}> Departure</label>
                    </div>

                    <div className={styles.optionButton}>
                        <Button></Button>
                        <label className={styles.buttonLabel}> Arrival</label>
                    </div>

                    <div className={styles.optionButton}>
                        <Button></Button>
                        <label className={styles.buttonLabel}> Date Picker</label>
                    </div>

                    <div className={styles.optionButton}>
                        <Button></Button>
                        <label className={styles.buttonLabel}> Additional options</label>
                    </div>
                </div>


                <div className={styles.inputButtonWrap}>
                    <button className={styles.inputButton}>Plan trip</button>
                    <button className={styles.inputButton} type="reset">Reset</button>
                </div>


            </div>

            {/*<div className={styles.inputSection}>*/}
            {/*    <div className={styles.searchIcon}/>*/}
            {/*    <label className={styles.inputLabel}> Address</label>*/}
            {/*    <input className={styles.inputSearch} type={"text"} required={true}/>*/}
            {/*</div>*/}

            {/*<div className={styles.inputButton}>*/}

            {/*</div>*/}

        </div>

    )
};
