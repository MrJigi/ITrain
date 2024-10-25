package iodigital.io_travelcoach.model.tripPlanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FareLegsResponse {
    private List<FareLegs> fareLegs;
}
