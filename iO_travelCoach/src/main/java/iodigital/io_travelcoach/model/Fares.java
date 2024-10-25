package iodigital.io_travelcoach.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Fares {
    public Number priceInCents;
    public String product;
    public String travelClass;
    public String discountType;

}
