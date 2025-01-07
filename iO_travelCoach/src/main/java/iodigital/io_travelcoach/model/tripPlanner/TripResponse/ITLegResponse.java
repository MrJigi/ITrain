package iodigital.io_travelcoach.model.tripPlanner.TripResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class ITLegResponse {
    private String travelType;
    private ITStationResponse origin;
    private ITStationResponse destination;
    private List<ITStopResponse> stops;
}
