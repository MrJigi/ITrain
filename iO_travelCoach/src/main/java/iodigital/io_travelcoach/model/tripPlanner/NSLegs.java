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

public class NSLegs {

    @JsonProperty("idx")
    public String idx;
    @JsonProperty("name")
    public String name;
    @JsonProperty("travelType")
    public String travelType;
    @JsonProperty("partCancelled")
    public Boolean partCancelled;
    @JsonProperty("direction")
    public String direction;
    @JsonProperty("cancelled")
    public Boolean cancelled;
    @JsonProperty("origin")
    public NSOrigin NSOrigin;
    @JsonProperty("destination")
    public NSDestination NSDestination;
    @JsonProperty("product")
    public NSProduct NSProduct;
    @JsonProperty("stops")
    public List<NSStop> NSStops;
    @JsonProperty("messages")
    public List<NSMessage> NSMessages;
    @JsonProperty("plannedDurationInMinutes")
    public Integer plannedDurationInMinutes;


}
