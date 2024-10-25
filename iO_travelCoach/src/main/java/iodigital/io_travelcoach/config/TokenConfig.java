package iodigital.io_travelcoach.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class TokenConfig {

    @Value("${ns.api.access.user.key}")
    private String nsApiName;
    @Value("${ns.api.access.trip.key}")
    private String nsTripApiKey;
    @Value("${ns.api.access.price.key}")
    private String nsPriceApiKey;
    @Value("${ns.api.access.reisinfo.key}")
    private String nsReisApiKey;
    @Value("${ev.api.name}")
    private String evApiname;
    @Value("${ev.api.key}")
    private String evApikey;

    public String getNsReisApiKey() {
        return nsReisApiKey;
    }

    public String getNsApiName() {
        return nsApiName;
    }

    public String getNsTripApiKey() {
        return nsTripApiKey;
    }

    public String getNsPriceApiKey() {
        return nsPriceApiKey;
    }

    public String getEvApiname() {
        return evApiname;
    }

    public String getEvApikey() {
        return evApikey;
    }
}
