package iodigital.io_travelcoach.model.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stop_times {

    @JsonProperty("trip_id")
    private String trip_id;
    @JsonProperty("arrival_time")
    private String arrival_time ;
    @JsonProperty("departure_time")
    private String departure_time ;
    @JsonProperty("stop_id")
    private String stop_id;
    @JsonProperty("stop_sequence")
    private String stop_sequence ;
    @JsonProperty("stop_headsign")
    private String stop_headsign;
    @JsonProperty("pickup_type")
    private String pickup_type;
    @JsonProperty("drop_off_type")
    private String drop_off_type;
    @JsonProperty("continuous_pickup")
    private String continuous_pickup;
    @JsonProperty("continuous_drop_off")
    private String continuous_drop_off;
    @JsonProperty("shape_dist_travel")
    private String shape_dist_travel;
    @JsonProperty("timepoint")
    private String timepoint;


    public String getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(String trip_id) {
        this.trip_id = trip_id;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getStop_id() {
        return stop_id;
    }

    public void setStop_id(String stop_id) {
        this.stop_id = stop_id;
    }

    public String getStop_sequence() {
        return stop_sequence;
    }

    public void setStop_sequence(String stop_sequence) {
        this.stop_sequence = stop_sequence;
    }

    public String getStop_headsign() {
        return stop_headsign;
    }

    public void setStop_headsign(String stop_headsign) {
        this.stop_headsign = stop_headsign;
    }

    public String getPickup_type() {
        return pickup_type;
    }

    public void setPickup_type(String pickup_type) {
        this.pickup_type = pickup_type;
    }

    public String getDrop_off_type() {
        return drop_off_type;
    }

    public void setDrop_off_type(String drop_off_type) {
        this.drop_off_type = drop_off_type;
    }

    public String getContinous_pickup() {
        return continuous_pickup;
    }

    public void setContinous_pickup(String continous_pickup) {
        this.continuous_pickup = continous_pickup;
    }

    public String getContinous_drop_off() {
        return continuous_drop_off;
    }

    public void setContinous_drop_off(String continous_drop_off) {
        this.continuous_drop_off = continous_drop_off;
    }

    public String getShape_dist_travel() {
        return shape_dist_travel;
    }

    public void setShape_dist_travel(String shape_dist_travel) {
        this.shape_dist_travel = shape_dist_travel;
    }

    public String getTimepoint() {
        return timepoint;
    }

    public void setTimepoint(String timepoint) {
        this.timepoint = timepoint;
    }
}
