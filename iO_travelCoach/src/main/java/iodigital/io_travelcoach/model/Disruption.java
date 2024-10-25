package iodigital.io_travelcoach.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import iodigital.io_travelcoach.service.disruption.*;
//import iodigital.io_travelcoach.service.disruption.Timespan;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.OffsetDateTime;
import java.util.List;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Disruption {
    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("isActive")
    private Boolean isActive;
//        @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("local")
    private Boolean local;
    @JsonProperty("titleSections")
    private List<List<TitleSection>> titleSections;
//    private List<List<TitleSection>> titleSections;  // Nested list for sections
    @JsonProperty("registrationTime")
    private String registrationTime;   // Time when disruption was registered
    @JsonProperty("releaseTime")
    private String releaseTime;
    @JsonProperty("start")
    private String start;
    @JsonProperty("end")
    private String end;
    @JsonProperty("period")
    private String period;
    @JsonProperty("phase")
    private Phase phase;    // Current phase (e.g., "Impact bekend")
    @JsonProperty("impact")
    private Impact impact;  // Impact value (e.g., 2)
    @JsonProperty("expectedDuration")
    private ExpectedDuration expectedDuration;  // Expected duration
    @JsonProperty("publicationSections")
    private List<PublicationSection> publicationSections;  // Affected stations and consequences
    @JsonProperty("timespans")
    private List<Timespan> timespans;   // Timespans related to the disruption



}


