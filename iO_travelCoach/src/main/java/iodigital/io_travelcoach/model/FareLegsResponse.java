package iodigital.io_travelcoach.model;

import iodigital.io_travelcoach.model.tripPlanner.FareLegs;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FareLegsResponse {
    private List<FareLegs> fareLegs;


}
