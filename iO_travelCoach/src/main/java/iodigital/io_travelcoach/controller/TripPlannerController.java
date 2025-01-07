package iodigital.io_travelcoach.controller;

import iodigital.io_travelcoach.config.TokenConfig;
import iodigital.io_travelcoach.model.tripPlanner.*;
//import iodigital.io_travelcoach.model.Leg;
//import iodigital.io_travelcoach.script.StationCode;
//import iodigital.io_travelcoach.security.NsAccess;
//import iodigital.io_travelcoach.service.DisruptionService;
//import iodigital.io_travelcoach.service.TravelService;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;
import iodigital.io_travelcoach.service.TripPlannerService;
import lombok.AllArgsConstructor;
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

//import java.util.ArrayList;
import java.io.IOException;

@RestController
@AllArgsConstructor
@RequestMapping("/api/trip")
public class TripPlannerController {

    private final TripPlannerService tripService;



    @GetMapping("/tripPlannerStation")
    public ResponseEntity<NSTripLayout> tripPlannerStation(
            @RequestParam String startStation,
            @RequestParam String endStation
    ) throws IOException {

        return tripService.tripPlannerStations(startStation,endStation);
}



//    @GetMapping("/tripPlan")
//    public ResponseEntity<NSTripLayout> tripPlannerStation(
//            @RequestParam String startStation,
//            @RequestParam String endStation,
//            @RequestParam String departureTime;
//    ) throws IOException {
//
//        return tripService.tripPlannerStations(startStation,endStation);
//    }







}
