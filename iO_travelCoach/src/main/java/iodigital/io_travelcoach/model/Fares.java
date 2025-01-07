package iodigital.io_travelcoach.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fares {

    @JsonProperty("priceInCents")
    public Number priceInCents;
    @JsonProperty("product")
    public String product;
    @JsonProperty("travelClass")
    public String travelClass;
    @JsonProperty("discountType")
    public String discountType;

}
