package iodigital.io_travelcoach.model.tripPlanner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)

public class Location {
    @JsonProperty("name")
    private String name;
    @JsonProperty("lng")
    private String lng;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("uicCode")
    private String uicCode;
    @JsonProperty("stationCode")
    private String stationCode;
    @JsonProperty("type")
    private String type;
    @JsonProperty("actualDateTime")
    private String actualDateTime;
    @JsonProperty("plannedTrack")
    private String plannedTrack;

}
