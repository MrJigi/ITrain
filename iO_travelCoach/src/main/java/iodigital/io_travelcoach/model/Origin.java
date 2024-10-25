package iodigital.io_travelcoach.model;

import iodigital.io_travelcoach.model.tripPlanner.FareLegs;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Origin {
    public String name;
    public String lng;
    public String lat;
    public String countryCode;
    public String uicCode;
    public String stationCode;
    public String type;
    public String plannedDateTime;
    public String actualDateTime;
    public String actualTrack;
    public String exitSide;

    public List<FareLegs> disruptionResponses;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getUicCode() {
        return uicCode;
    }

    public void setUicCode(String uicCode) {
        this.uicCode = uicCode;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlannedDateTime() {
        return plannedDateTime;
    }

    public void setPlannedDateTime(String plannedDateTime) {
        this.plannedDateTime = plannedDateTime;
    }

    public String getActualDateTime() {
        return actualDateTime;
    }

    public void setActualDateTime(String actualDateTime) {
        this.actualDateTime = actualDateTime;
    }

    public String getActualTrack() {
        return actualTrack;
    }

    public void setActualTrack(String actualTrack) {
        this.actualTrack = actualTrack;
    }

    public String getExitSide() {
        return exitSide;
    }

    public void setExitSide(String exitSide) {
        this.exitSide = exitSide;
    }

    public List<FareLegs> getDisruptionResponses() {
        return disruptionResponses;
    }

    public void setDisruptionResponses(List<FareLegs> disruptionResponses) {
        this.disruptionResponses = disruptionResponses;
    }
}
