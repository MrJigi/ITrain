package iodigital.io_travelcoach.controller;

import iodigital.io_travelcoach.config.TokenConfig;
import iodigital.io_travelcoach.model.tripPlanner.FareLegs;
//import iodigital.io_travelcoach.model.Leg;
//import iodigital.io_travelcoach.script.StationCode;
//import iodigital.io_travelcoach.security.NsAccess;
//import iodigital.io_travelcoach.service.DisruptionService;
//import iodigital.io_travelcoach.service.TravelService;
import iodigital.io_travelcoach.model.tripPlanner.FareLegsResponse;
import iodigital.io_travelcoach.model.tripPlanner.Stop;
import iodigital.io_travelcoach.model.tripPlanner.TripDetails;
import iodigital.io_travelcoach.service.TripPlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/trip")
public class TripPlannerController {
    private RestTemplate restTemplate = new RestTemplate();
    private final TripPlannerService tripPlannerService;
    private final TokenConfig tokenConfig;

//    @Autowired
//    public TripPlannerController(RestTemplate restTemplate, TripPlannerService tripPlannerService, TokenConfig tokenConfig) {
//        this.restTemplate = restTemplate;
//        this.tripPlannerService = tripPlannerService;
//        this.tokenConfig = tokenConfig;
//    }

    @Autowired
    public TripPlannerController(TripPlannerService tripPlannerService, TokenConfig tokenConfig) {
        this.tripPlannerService = tripPlannerService;
        this.tokenConfig = tokenConfig;
    }



    @GetMapping("/tripPlannerStation")
    public ResponseEntity<TripDetails> tripPlannerStation(
            @RequestParam String startStation,
            @RequestParam String endStation
    ) {
//        String originStation = startStation;
//        String destinationStation = endStation;
//        Pre setting the parameters
         String originStation = TripPlannerService.station.findStationCode(startStation);
        String destinationStation = TripPlannerService.station.findStationCode(endStation);
        String url = TripPlannerService.nsAccess.reisInformatieStationToStation(originStation,destinationStation);

        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(),tokenConfig.getNsTripApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<FareLegsResponse> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                FareLegsResponse.class
        );

        List<FareLegs> fareLegs = response.getBody() != null ? response.getBody().getFareLegs() : new ArrayList<>();

        if(!fareLegs.isEmpty()) {
            TripDetails tripDetails = TripPlannerService.getTripDetails(fareLegs);
            return ResponseEntity.ok(tripDetails);
        } else {
            return ResponseEntity.notFound().build();
        }




}







}
