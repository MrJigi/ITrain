package iodigital.io_travelcoach.config;

import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SharedLogicConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public NsAccess nsAccess() {
        return new NsAccess();
    }

    @Bean
    public TokenConfig tokenConfig() {
        return new TokenConfig();
    }

    @Bean
    public StationCode stationCode() {
        return new StationCode();
    }



}
