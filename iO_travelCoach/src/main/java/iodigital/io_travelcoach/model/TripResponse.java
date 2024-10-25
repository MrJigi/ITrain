package iodigital.io_travelcoach.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class TripResponse {

    // General trip information
    private String origin;  // Starting station
    private String destination;  // Final station
    private String departureTime;  // When the trip starts
    private String arrivalTime;  // When the trip ends
    private List<Stop> stops;  // List of stops between origin and destination
    private boolean hasDisruptions;  // True if there are disruptions on the trip
    private List<Disruption> disruptions;  // Detailed list of disruptions (if any)

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    public boolean isHasDisruptions() {
        return hasDisruptions;
    }

    public void setHasDisruptions(boolean hasDisruptions) {
        this.hasDisruptions = hasDisruptions;
    }

    public List<Disruption> getDisruptions() {
        return disruptions;
    }

    public void setDisruptions(List<Disruption> disruptions) {
        this.disruptions = disruptions;
    }

    @Getter
    @Setter
    // Nested class for each stop
    public static class Stop {

        private String stationName;  // Name of the station
        private String arrivalTime;  // Time of arrival at this station
        private String departureTime;  // Time of departure from this station
        private int trackNumber;  // Track number for the stop
        private boolean isDisrupted;  // Whether this stop is affected by a disruption
        private String stationCode;
        // Getters and setters


        public String getStationName() {
            return stationName;
        }

        public void setStationName(String stationName) {
            this.stationName = stationName;
        }

        public String getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public String getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
        }

        public int getTrackNumber() {
            return trackNumber;
        }

        public void setTrackNumber(int trackNumber) {
            this.trackNumber = trackNumber;
        }

        public boolean isDisrupted() {
            return isDisrupted;
        }

        public void setDisrupted(boolean disrupted) {
            isDisrupted = disrupted;
        }

        public String getStationCode() {
            return stationCode;
        }

        public void setStationCode(String stationCode) {
            this.stationCode = stationCode;
        }
    }
    @Setter
    @Getter
    public static class DisruptionInTrip {
        private String disruptionMessage;  // Disruption message or reason
        private String startTime;  // When the disruption starts
        private String endTime;  // When the disruption ends
        private List<String> affectedStations;  // Stations affected by this disruption

        // Getters and setters


        public String getDisruptionMessage() {
            return disruptionMessage;
        }

        public void setDisruptionMessage(String disruptionMessage) {
            this.disruptionMessage = disruptionMessage;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public List<String> getAffectedStations() {
            return affectedStations;
        }

        public void setAffectedStations(List<String> affectedStations) {
            this.affectedStations = affectedStations;
        }
    }
}
