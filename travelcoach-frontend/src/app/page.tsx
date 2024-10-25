import styles from "./page.module.css";
// import Link from "next/link";
import Schedule from "@/app/models/schedule/schedule";
import Transportation from "@/app/models/transportationOptions/transportation";
import Mapoverview from "@/app/models/mapOverview/mapoverview";
import Googlemap from "@/app/models/googleMaps/googlemap";
import InputBox from "@/app/models/inputBoxes/inputBox";
import MapPage from "@/app/mainPage/mapPage";
import stepPage from "@/app/stepPage/step";
import React from "react";
import GTFSParser from "@/app/models/gtfsMap/busMap";



export default function Home() {
  return (

          <div className={styles.page}>
              stuff
              {/*<h1> Map page </h1>*/}
              {/*<StepPage></StepPage>*/}

              <MapPage></MapPage>
                {/*<Mapoverview/>*/}
              {/*<GTFSParser></GTFSParser>*/}
              {/*<div className={styles.scheduleBox}>*/}
              {/*    <h1>schedule Component</h1>*/}
              {/*    <Schedule></Schedule>*/}
              {/*    <h1>transportation Component</h1>*/}
              {/*    <Transportation></Transportation>*/}
              {/*    <h1>Leaflet Map Component</h1>*/}
              {/*    <Mapoverview></Mapoverview>*/}
              {/*    <h1> google maps</h1>*/}
              {/*    <Googlemap></Googlemap>*/}
              {/*    <h1> Input section</h1>*/}
              {/*    <InputBox></InputBox>*/}

              {/*</div>*/}
          </div>
  );
          }
