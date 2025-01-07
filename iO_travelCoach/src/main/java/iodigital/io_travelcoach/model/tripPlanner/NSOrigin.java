package iodigital.io_travelcoach.model.tripPlanner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class NSOrigin {
    @JsonProperty("name")
    public String name;
    @JsonProperty("lng")
    public String lng;
    @JsonProperty("lat")
    public String lat;
    @JsonProperty("countryCode")
    public String countryCode;
    @JsonProperty("uicCode")
    public String uicCode;
    @JsonProperty("stationCode")
    public String stationCode;
    @JsonProperty("type")
    public String type;
    @JsonProperty("actualDateTime")
    public String actualDateTime;
    @JsonProperty("plannedTrack")
    public String plannedTrack;
    @JsonProperty("actualTimeZoneOffset")
    public String actualTimeZoneOffset;
    @JsonProperty("plannedTimeZoneOffset")
    public String plannedTimeZoneOffset;
    @JsonProperty("plannedDateTime")
    public String plannedDateTime;
    @JsonProperty("actualTrack")
    public String actualTrack;
    @JsonProperty("checkinStatus")
    public String checkinStatus;
    @JsonProperty("notes")
    public List<String> notes;



}
