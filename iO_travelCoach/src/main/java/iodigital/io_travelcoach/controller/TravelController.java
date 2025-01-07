package iodigital.io_travelcoach.controller;

import iodigital.io_travelcoach.model.TripResponse;
import iodigital.io_travelcoach.model.tripPlanner.NSTripLayout;
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
    private final TravelService travelService ;


    @Autowired
    public TravelController(TravelService travelService) {
    this.travelService = travelService;
    }


//    Allows the user to get info on all inbetween routes and prices


    //Request price amount from location A to B (Not filtered by class or subscription)
//    @RequestParam()
    @GetMapping("/getNearestStation")
    public ResponseEntity<String> getIt(@RequestParam Double lat,
                                        @RequestParam Double lng,
                                        @RequestParam Integer amount) {

        return travelService.getNearestStation(lat,lng,amount);

    }

    @GetMapping("/getNsStation")
    public ResponseEntity<NSTripLayout> destination(@RequestParam String station){

        return travelService.getNsStations(station);

    }

    @GetMapping("/getTripFromTo")
    public TripResponse tripInformation(@RequestParam String startStation, @RequestParam String endStation){
     return travelService.getInfoForTrip(startStation,endStation);
    }
}
