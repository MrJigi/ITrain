package iodigital.io_travelcoach.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NsAccess {

    public String openMapBaseURL() { return "https://api.openchargemap.io/v3/poi";}

    // ================= 3 main Disturbance api's ====================================================================
    public String disruptionBaseUrl(){
        return "https://gateway.apiportal.ns.nl/disruptions/v3/";
    }

    // Can add a boolean propperty of ?isActive disturbance
    // Can add a string propperty of ?type "maintenance", "calamity" , "disruption"
    public String disruptionsGetAll(){return "https://gateway.apiportal.ns.nl/disruptions/v3";}


//    Incomplete because need ENUM for type of disturbance and individual disturbance ID
//    public String disruptionOnSingleDisruption(){return "https://gateway.apiportal.ns.nl/disruptions/v3/{type}/{id}"}
    // =================  custom Disturbance api's ====================================================================

    public String disruptionStationBaseUrl(String stationCode){
        return "https://gateway.apiportal.ns.nl/disruptions/v3/station/"+stationCode;
    }

    // ================= 3 main Disturbance api's ====================================================================




    // ================= 3 main Reisinformatie api's =================

    // ================= Get all trainStation information =================
//    https://gateway.apiportal.ns.nl/reisinformatie-api/api/v2/stations[?q][&countryCodes][&limit]
    public String StationInformationAll(){return "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v2/stations";}
    // ================= Get all trainStation information =================

    public String reisInformatieBaseUrl(){ return "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v3/trips";}

    public String getReisInformatieFromToStation(String startStation, String endStation){
        return "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v3/trips?fromStation="+startStation+"&toStation="+endStation;
    }
    public String reisInformatieStationToStation(String startStation,String endStation){return "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v3/trips?fromStation="+startStation+"&toStation="+endStation;}



}
