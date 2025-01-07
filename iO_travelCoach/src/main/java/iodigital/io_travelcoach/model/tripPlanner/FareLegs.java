package iodigital.io_travelcoach.model.tripPlanner;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FareLegs {

    @JsonProperty("origin")
    private List<NSOrigin> NSOrigin;
    @JsonProperty("destination")
    private List<NSDestination> NSDestination;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("productTypes")
    private List<String> productTypes;
//    private List<Fare> fares;
    @JsonProperty("stops")
    private List<NSStop> NSStops;
    @JsonProperty("source")
    private String source;


}


