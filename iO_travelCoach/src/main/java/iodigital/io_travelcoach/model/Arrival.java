package iodigital.io_travelcoach.model;

import java.util.List;

public class Arrival {


    public Arrival(String plannedDateTime, int plannedTimeZoneOffset, String actualDateTime, int actualTimeZoneOffset, String plannedTrack, String actualTrack, Product product, String trainCategory, boolean cancelled, List<String> messages, String arrivalStatus, String origin, String name) {
        this.plannedDateTime = plannedDateTime;
        this.plannedTimeZoneOffset = plannedTimeZoneOffset;
        this.actualDateTime = actualDateTime;
        this.actualTimeZoneOffset = actualTimeZoneOffset;
        this.plannedTrack = plannedTrack;
        this.actualTrack = actualTrack;
        this.product = product;
        this.trainCategory = trainCategory;
        this.cancelled = cancelled;
        this.messages = messages;
        this.arrivalStatus = arrivalStatus;
        this.origin = origin;
        this.name = name;
    }

    private String plannedDateTime;
    private int plannedTimeZoneOffset;
    private String actualDateTime;
    private int actualTimeZoneOffset;
    private String plannedTrack;
    private String actualTrack;
    private Product product;
    private String trainCategory;
    private boolean cancelled;
    private List<String> messages;
    private String arrivalStatus;
    private String origin;
    private String name;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlannedDateTime() {
        return plannedDateTime;
    }

    public void setPlannedDateTime(String plannedDateTime) {
        this.plannedDateTime = plannedDateTime;
    }

    public int getPlannedTimeZoneOffset() {
        return plannedTimeZoneOffset;
    }

    public void setPlannedTimeZoneOffset(int plannedTimeZoneOffset) {
        this.plannedTimeZoneOffset = plannedTimeZoneOffset;
    }

    public String getActualDateTime() {
        return actualDateTime;
    }

    public void setActualDateTime(String actualDateTime) {
        this.actualDateTime = actualDateTime;
    }

    public int getActualTimeZoneOffset() {
        return actualTimeZoneOffset;
    }

    public void setActualTimeZoneOffset(int actualTimeZoneOffset) {
        this.actualTimeZoneOffset = actualTimeZoneOffset;
    }

    public String getPlannedTrack() {
        return plannedTrack;
    }

    public void setPlannedTrack(String plannedTrack) {
        this.plannedTrack = plannedTrack;
    }

    public String getActualTrack() {
        return actualTrack;
    }

    public void setActualTrack(String actualTrack) {
        this.actualTrack = actualTrack;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getTrainCategory() {
        return trainCategory;
    }

    public void setTrainCategory(String trainCategory) {
        this.trainCategory = trainCategory;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public String getArrivalStatus() {
        return arrivalStatus;
    }

    public void setArrivalStatus(String arrivalStatus) {
        this.arrivalStatus = arrivalStatus;
    }

}
