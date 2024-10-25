package iodigital.io_travelcoach.service.disruption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Station {

    @JsonProperty("name")
    private String name;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("stationCode")
    private String stationCode;
    @JsonProperty("uicCode")
    private String uicCode;
    @JsonProperty("coordinate")
    private Coordinate coordinate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStationCode() {
        return stationCode;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getUicCode() {
        return uicCode;
    }

    public void setUicCode(String uicCode) {
        this.uicCode = uicCode;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
