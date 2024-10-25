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
public class TripDetails {


    private List<FareLegs> fareLegs;
    private List<Stop> stops;
}
