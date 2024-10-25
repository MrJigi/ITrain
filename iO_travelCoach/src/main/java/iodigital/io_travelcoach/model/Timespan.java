package iodigital.io_travelcoach.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import iodigital.io_travelcoach.service.disruption.AdditionalTravelTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Timespan {
    @JsonProperty("start")
    private OffsetDateTime start;
    @JsonProperty("end")
    private OffsetDateTime end;
    @JsonProperty("period")
    private String period;

    @JsonProperty("situation")
    private Situation situation;

    @JsonProperty("cause")
    private Cause cause;

    @JsonProperty("additionalTravelTime")
    private AdditionalTravelTime additionalTravelTime;

    @JsonProperty("advices")
    private List<String> advices;


}
