package iodigital.io_travelcoach.controller;

import iodigital.io_travelcoach.model.TripResponse;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/travel")
public class TravelController {

    //From and to station
    //Need a duration of the trip

    @Autowired
    public TravelController(TravelService travelService) {

    }

    StationCode stationService = new StationCode();

    private RestTemplate restTemplate = new RestTemplate();


//    Allows the user to get info on all inbetween routes and prices


    //Request price amount from location A to B (Not filtered by class or subscription)
//    @RequestParam()
    @GetMapping("/getNearestStation")
    public ResponseEntity<String> getIt(@RequestParam double lat,
                                        @RequestParam double lng,
                                        @RequestParam int amount) {

        double latitude = lat;
        double longitude = lng;
        int limit = amount;

        String url = "https://gateway.apiportal.ns.nl/nsapp-stations/v3/nearest?lat="+latitude+"&lng="+longitude+"&limit="+limit+" ";
        // Set up headers with the subscription key
        HttpHeaders headers = new HttpHeaders();
        headers.set(TravelService.tokenConfig.getNsApiName(), TravelService.tokenConfig.getNsTripApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
    }

    @GetMapping("/getNsStation")
    public ResponseEntity<String> destination(@RequestParam String station){

        String stationCode = stationService.findStationCode(station);
        String url = "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v2/departures?station="+stationCode+" ";
        // Set up headers with the subscription key
        HttpHeaders headers = new HttpHeaders();
        headers.set(TravelService.tokenConfig.getNsApiName(), TravelService.tokenConfig.getNsPriceApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET,entity, String.class);

    }

    @GetMapping("/getTripFromTo")
    public TripResponse tripInformation(@RequestParam String startStation, @RequestParam String endStation){


    String originStation = stationService.findStationCode(startStation);
    String finalStation = stationService.findStationCode(endStation);

    String url = "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v3/trips?fromStation="+originStation+"&toStation="+finalStation;
    // Set up headers with the subscription key
    HttpHeaders headers = new HttpHeaders();
    headers.set(TravelService.tokenConfig.getNsApiName(), TravelService.tokenConfig.getNsReisApiKey());
    HttpEntity<String> entity = new HttpEntity<>(headers);

    ResponseEntity<TripResponse> trip = restTemplate.exchange(url, HttpMethod.GET,entity, TripResponse.class);
    return trip.getBody();


    }
}
