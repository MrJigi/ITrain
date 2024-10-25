package iodigital.io_travelcoach.model.tripPlanner;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FareLegs {

    private List<Location> origin;
    private List<Location> destination;
    private String operator;
    private List<String> productTypes;
    private List<Fare> fares;
    private List<Stop> stops;

}


