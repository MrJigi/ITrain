package iodigital.io_travelcoach.dto.Response.Disruption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class  StationInformation {

    @JsonProperty("name")
    private String name;
    @JsonProperty("stationCode")
    private String stationCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("uicCode")
    private String uicCode;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lang")
    private Double lang;

    // Constructor with parameters


}
