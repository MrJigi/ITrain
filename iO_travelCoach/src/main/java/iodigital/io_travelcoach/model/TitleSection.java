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
public class TitleSection {

    @JsonProperty("type")
    private String type;
    @JsonProperty("value")
    private String value;

}
