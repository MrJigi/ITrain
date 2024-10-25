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
public class Stop {
    private String uicCode;
    private String name;
    private double lat;
    private double lng;
    private String countryCode;
    private List<String> notes; // Assuming notes is a list of strings
    private int routeIdx;
    private String plannedDepartureDateTime;
    private int plannedDepartureTimeZoneOffset;
    private String actualDepartureDateTime;
    private int actualDepartureTimeZoneOffset;
    private String actualDepartureTrack;
    private String plannedDepartureTrack;
    private String plannedArrivalTrack;
    private String actualArrivalTrack;
    private int departureDelayInSeconds;
    private int arrivalDelayInSeconds;
    private boolean cancelled;
    private boolean borderStop;
    private boolean passing;
}
