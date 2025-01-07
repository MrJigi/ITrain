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
public class ITTripResponse {

    private List<ITLegResponse> legs;
    private Number totalDurationInMinutes;
}
