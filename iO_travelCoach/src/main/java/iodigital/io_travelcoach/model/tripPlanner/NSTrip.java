package iodigital.io_travelcoach.model.tripPlanner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NSTrip {

    @JsonProperty("idx")
    public String idx;
    @JsonProperty("uid")
    public String uid;
    @JsonProperty("ctxRecon")
    public String ctxRecon;
    @JsonProperty("sourceCtxRecon")
    public String sourceCtxRecon;
    @JsonProperty("plannedDurationInMinutes")
    public Number plannedDurationInMinutes;
    @JsonProperty("actualDurationInMinutes")
    public Number actualDurationInMinutes;
    @JsonProperty("transfers")
    public Number transfers;
    @JsonProperty("status")
    public String status;
    @JsonProperty("messages")
    public List<NSMessage> messages;
    @JsonProperty("legs")
    public List<NSLegs> legs;
    @JsonProperty("fareLegs")
    public List<NSFareLegs> fareLegs;


}
