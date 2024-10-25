package iodigital.io_travelcoach.service;

import iodigital.io_travelcoach.config.TokenConfig;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Service
@Getter
@Setter
public class TravelService {

    private static final RestTemplate restTemplate = new RestTemplate();
    public static NsAccess nsAccess;
    public static TokenConfig tokenConfig;
    public static StationCode station ;



}
