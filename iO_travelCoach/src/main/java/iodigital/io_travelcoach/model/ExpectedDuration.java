package iodigital.io_travelcoach.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExpectedDuration {
    @JsonProperty("description")
    private String description;
    @JsonProperty("endTime")
    private String endTime;

}
