package iodigital.io_travelcoach.model.tripPlanner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class NSProduct {

    @JsonProperty("productType")
    private String productType;
    @JsonProperty("number")
    private String number;
    @JsonProperty("categoryCode")
    private String categoryCode;
    @JsonProperty("shortCategoryName")
    private String shortCategoryName;
    @JsonProperty("longCategoryName")
    private String longCategoryName;
    @JsonProperty("operatorCode")
    private String operatorCode;
    @JsonProperty("operatorName")
    private String operatorName;
    @JsonProperty("operatorAdministrativeCode")
    private String operatorAdministrativeCode;
    @JsonProperty("type")
    private String type;
    @JsonProperty("displayName")
    private String displayName;
//    @JsonProperty("notes")
//    private List<String> notes;

}
