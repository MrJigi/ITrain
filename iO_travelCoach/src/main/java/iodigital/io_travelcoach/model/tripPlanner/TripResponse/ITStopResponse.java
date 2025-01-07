package iodigital.io_travelcoach.model.tripPlanner.TripResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ITStopResponse {

    private String name;
    private String plannedDepartureDateTime;
    private String plannedArrivalDateTime;
    private Double lat;
    private Double lng;
    private Boolean cancelled;
    private String plannedDepartureTrack;
    private String plannedArrivalTrack;
}
