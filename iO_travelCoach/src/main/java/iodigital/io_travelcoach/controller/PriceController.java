package iodigital.io_travelcoach.controller;

import iodigital.io_travelcoach.script.StationCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/price")
public class PriceController {

    @Value("${ns.api.access.price.key}")
    private String apiPriceKey;
    @Value("${ns.api.access.user.key}")
    private String accessUserKey;

    StationCode station = new StationCode();

    private RestTemplate restTemplate = new RestTemplate();

    //Request price amount from location A to B (Not filtered by class or subscription)
//    @RequestParam()
    @GetMapping("/getPrice")
    public ResponseEntity<String> getIt( @RequestParam String startStation,
                                         @RequestParam String endStation) {

                 String startLoc = station.findStationCode(startStation);
                 String endLoc = station.findStationCode(endStation);

        String url = "https://gateway.apiportal.ns.nl/public-prijsinformatie/prices?fromStation="+startLoc+"&toStation="+endLoc;
        // Set up headers with the subscription key
        HttpHeaders headers = new HttpHeaders();
        headers.set(accessUserKey, apiPriceKey);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
    }

    
}
