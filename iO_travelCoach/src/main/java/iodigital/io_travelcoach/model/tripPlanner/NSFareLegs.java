package iodigital.io_travelcoach.model.tripPlanner;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import iodigital.io_travelcoach.model.Fares;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NSFareLegs {
    @JsonProperty("origin")
    public NSOrigin fareOrigin;
    @JsonProperty("destination")
    public NSDestination fareDestination;
    @JsonProperty("operator")
    public String operator;
    @JsonProperty("fares")
    public Fares[] fares;
//    @JsonProperty("priceInCents")
//    public int priceInCents;
//    @JsonProperty("priceInCentsExcludingSupplement")
//    public int priceInCentsExcludingSupplement;
//    @JsonProperty("supplementInCents")
//    public int supplementInCents;
//    @JsonProperty("buyableTicketSupplementPriceInCents")
//    public int buyableTicketSupplementPriceInCents;
//    @JsonProperty("NSProduct")
//    public String product;
//    @JsonProperty("travelClass")
//    public String travelClass;
//    @JsonProperty("discountType")
//    public String discountType;
}
