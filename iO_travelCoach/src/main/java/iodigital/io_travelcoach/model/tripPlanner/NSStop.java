package iodigital.io_travelcoach.model.tripPlanner;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)

public class NSStop {
    @JsonProperty("uicCode")
    public String uicCode;
    @JsonProperty("name")
    public String name;
    @JsonProperty("lat")
    public double lat;
    @JsonProperty("lng")
    public double lng;
    @JsonProperty("countryCode")
    public String countryCode;
    @JsonProperty("notes")
    public List<String> notes; // Assuming notes is a list of strings
    @JsonProperty("routeIdx")
    public int routeIdx;
    @JsonProperty("plannedDepartureDateTime")
    public String plannedDepartureDateTime;
    @JsonProperty("plannedDepartureTimeZoneOffset")
    public int plannedDepartureTimeZoneOffset;
    @JsonProperty("actualDepartureDateTime")
    public String actualDepartureDateTime;
    @JsonProperty("actualDepartureTimeZoneOffset")
    public int actualDepartureTimeZoneOffset;
    @JsonProperty("actualDepartureTrack")
    public String actualDepartureTrack;
    @JsonProperty("plannedDepartureTrack")
    public String plannedDepartureTrack;
    @JsonProperty("plannedArrivalTrack")
    public String plannedArrivalTrack;
    @JsonProperty("actualArrivalTrack")
    public String actualArrivalTrack;
    @JsonProperty("departureDelayInSeconds")
    public int departureDelayInSeconds;
    @JsonProperty("arrivalDelayInSeconds")
    public int arrivalDelayInSeconds;
    @JsonProperty("cancelled")
    public boolean cancelled;
    @JsonProperty("borderStop")
    public boolean borderStop;
    @JsonProperty("passing")
    public boolean passing;
}
