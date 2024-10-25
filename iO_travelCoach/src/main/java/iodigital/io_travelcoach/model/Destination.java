package iodigital.io_travelcoach.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Destination {
    public String name;
    public String lng;
    public String lat;
    public String countryCode;
    public String uicCode;
    public String stationCode;
    public String type;
    public String plannedDateTime;
    public String actualDateTime;
    public String actualTrack;
    public String exitSide;

}
