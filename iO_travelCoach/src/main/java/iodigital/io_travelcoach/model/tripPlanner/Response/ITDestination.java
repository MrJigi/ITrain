package iodigital.io_travelcoach.model.tripPlanner.Response;

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
public class ITDestination {

    public String name;
    public String lng;
    public String lat;
    public String stationCode;
    public String plannedDateTime;
    public String actualTrack;
    public String type;
    public String exitSide;
}
