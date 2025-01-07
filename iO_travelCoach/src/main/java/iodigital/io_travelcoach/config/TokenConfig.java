package iodigital.io_travelcoach.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Component
//@ConfigurationProperties(prefix = "ns.api.access")
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

}
