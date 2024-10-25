package iodigital.io_travelcoach.service.disruption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdditionalTravelTime {

    @JsonProperty("label")
    private String label;
    @JsonProperty("shortLabel")
    private String shortLabel;


//    public String getLabel() {
//        return label;
//    }
//
//    public void setLabel(String label) {
//        this.label = label;
//    }
//
//    public String getShortLabel() {
//        return shortLabel;
//    }
//
//    public void setShortLabel(String shotLabel) {
//        this.shortLabel = shotLabel;
//    }
}
