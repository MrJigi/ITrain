package iodigital.io_travelcoach.security;

import org.springframework.beans.factory.annotation.Value;

public class NsAccess {

    public String openMapBaseURL() { return "https://api.openchargemap.io/v3/poi";}

    public String disruptionBaseUrl(){
        return "https://gateway.apiportal.ns.nl/disruptions/v3/";
    }

    public String disruptionStationBaseUrl(){
        return "https://gateway.apiportal.ns.nl/disruptions/v3/station/";
    }
    public String singleDisruptionBaseUrl(){
        return "https://gateway.apiportal.ns.nl/disruptions/v3/";
    }
    public String reisInformatieBaseUrl(){ return "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v3/trips";}

    public String reisInformatieStationToStation(String startStation,String endStation){return "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v3/trips?fromStation="+startStation+"&toStation="+endStation;}

}
