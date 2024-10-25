package iodigital.io_travelcoach.model.tripPlanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Location {
    private String name;
    private String lng;
    private String lat;
    private String countryCode;
    private String uicCode;
    private String stationCode;
    private String type;
    private String ActualDateTime;

}
