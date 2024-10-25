package iodigital.io_travelcoach.model;

import iodigital.io_travelcoach.model.POJO.Stops;
import iodigital.io_travelcoach.service.disruption.Station;

import java.util.List;

public class Leg {

    private Station origin;
    private Station destination;
    private List<ReisStop> stops;
    private String departureTime;
    private String arrivalTime;
    private String trainType;


    // Getters and Setters
    public Station getOrigin() { return origin; }
    public void setOrigin(Station origin) { this.origin = origin; }

    public Station getDestination() { return destination; }
    public void setDestination(Station destination) { this.destination = destination; }

    public List<ReisStop> getStops() { return stops; }
    public void setStops(List<ReisStop> stops) { this.stops = stops; }

    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    public String getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(String arrivalTime) { this.arrivalTime = arrivalTime; }

    public String getTrainType() { return trainType; }
    public void setTrainType(String trainType) { this.trainType = trainType; }


}
