package iodigital.io_travelcoach.model.tripPlanner;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Fare {
    private int priceInCents;
    private int priceInCentsExcludingSupplement;
    private int supplementInCents;
    private int buyableTicketSupplementPriceInCents;
    private String product;
    private String travelClass;
    private String discountType;
}
