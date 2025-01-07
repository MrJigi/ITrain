package iodigital.io_travelcoach.model.tripPlanner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NSMessage {

    @JsonProperty("id")
    private String id;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("head")
    private String head;
    @JsonProperty("text")
    private String text;
    @JsonProperty("lead")
    private String lead;
    @JsonProperty("type")
    private String type;

}
