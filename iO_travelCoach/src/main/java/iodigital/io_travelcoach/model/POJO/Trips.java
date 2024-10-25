package iodigital.io_travelcoach.model.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trips {

    @JsonProperty("route_id")
    private String route_id;
    @JsonProperty("service_id")
    private String service_id;
    @JsonProperty("trip_id")
    private String trip_id;
    @JsonProperty("trip_headSign")
    private String trip_headSign;
    @JsonProperty("trip_short_name")
    private String trip_short_name;

    public String getRoute_id() {
        return route_id;
    }

    public void setRoute_id(String route_id) {
        this.route_id = route_id;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(String trip_id) {
        this.trip_id = trip_id;
    }

    public String getTrip_headSign() {
        return trip_headSign;
    }

    public void setTrip_headSign(String trip_headSign) {
        this.trip_headSign = trip_headSign;
    }

    public String getTrip_short_name() {
        return trip_short_name;
    }

    public void setTrip_short_name(String trip_short_name) {
        this.trip_short_name = trip_short_name;
    }
}
