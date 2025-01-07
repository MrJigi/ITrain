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
public class NSTripLayout {

    @JsonProperty("source")
    public String source;

    @JsonProperty("trips")
    public List<NSTrip> NSTrips;


}
