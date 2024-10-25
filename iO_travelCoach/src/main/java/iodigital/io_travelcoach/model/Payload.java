package iodigital.io_travelcoach.model;

import java.util.List;

public class Payload {

    private String source;
    private List<Arrival> arrivals;


    public Payload(String source, List<Arrival> arrivals) {
        this.source = source;
        this.arrivals = arrivals;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Arrival> getArrivals() {
        return arrivals;
    }

    public void setArrivals(List<Arrival> arrivals) {
        this.arrivals = arrivals;
    }
}
