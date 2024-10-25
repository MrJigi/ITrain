package iodigital.io_travelcoach.controller;


import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import iodigital.io_travelcoach.config.TokenConfig;

import iodigital.io_travelcoach.dto.Response.Disruption.DisruptionResponse;
import iodigital.io_travelcoach.model.Disruption;
import iodigital.io_travelcoach.model.TripResponse;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;

import iodigital.io_travelcoach.service.DisruptionService;
import iodigital.io_travelcoach.service.TravelService;

import iodigital.io_travelcoach.service.disruption.Station;
import org.antlr.v4.runtime.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import static iodigital.io_travelcoach.service.DisruptionService.*;


@RestController
@RequestMapping("/api/disruption")
public class DisruptionController {

//    @Value("${ns.api.access.price.key}")
//    private String apiPriceKey;
//    @Value("${ns.api.access.user.key}")
//    private String accessUserKey;
@Autowired
public DisruptionController(DisruptionService disruptionService) {
this.disruptionService = disruptionService;
}
    TravelController travelController = new TravelController(new TravelService());

    private final DisruptionService disruptionService;

    private final RestTemplate restTemplate = new RestTemplate();




    @GetMapping("/checkDisturbanceOnTrip")
    public List<Disruption> checkForDisturbances(
            @RequestParam String startStation,
            @RequestParam String endStation,
            @RequestParam String travelDateTime)
    {
        // Step 1: Get the trip information (departure, destination, stops)
//        TripResponse tripResponse = tripInformation
        TripResponse tripInfo = travelController.tripInformation(startStation,endStation);

        // Step 2: Extract all stations (including intermediate stops) from the trip
        List<String> stationsOnRoute =  extractStationsFromTrip(tripInfo);


        // Step 3: Fetch disturbance data for the relevant stations
        List<Disruption> allDisruptions = new ArrayList<>();
        for (String station : stationsOnRoute) {
            Disruption[] disruptions = getDisruption(station,endStation,"October");  // Fetch disruptions for each station
            allDisruptions.addAll(Arrays.asList(disruptions));
        }

        // Step 4: Filter out disruptions that overlap with the trip time
        List<Disruption> relevantDisruptions = filterRelevantDisruptions(tripInfo, allDisruptions);

        // Return only the disruptions that affect the trip
        return relevantDisruptions;
    }

    private List<String> extractStationsFromTrip(TripResponse tripInfo) {
        System.out.println(tripInfo);
        List<String> stations = new ArrayList<>();
        stations.add(tripInfo.getOrigin());  // Add starting station
        for (TripResponse.Stop stop : tripInfo.getStops()) {        // Add all intermediate stops
            stations.add(stop.getStationName());
        }
        stations.add(tripInfo.getDestination());    // Add destination station
        return stations;
    }

    // Filter a list of disruptions
    private List<Disruption> filterRelevantDisruptions(TripResponse tripInfo, List<Disruption> disruptions) {
        List<Disruption> releventDisruptions = new ArrayList<>();
        for(Disruption disruption : disruptions) {
            if(disruptionAffectsTrip(tripInfo,disruption)){
                releventDisruptions.add(disruption);
            }
        }
        return releventDisruptions;
    }

    private boolean disruptionAffectsTrip(TripResponse tripInfo, Disruption disruption) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");

        LocalDateTime departureTime = LocalDateTime.parse(tripInfo.getDepartureTime(), formatter);
        LocalDateTime arrivalTime = LocalDateTime.parse(tripInfo.getArrivalTime(), formatter);

        LocalDateTime disruptionStart = LocalDateTime.parse(disruption.getStart(), formatter);
        LocalDateTime disruptionEnd = LocalDateTime.parse(disruption.getEnd(), formatter);



        List<String> tripStations = tripInfo.getStops().stream()
                .map(TripResponse.Stop::getStationCode)
                .toList();

        List<String> disturbedStations = disruption.getPublicationSections().stream()
                .flatMap(section -> section.getSection().getStations().stream())
                .map(Station::getStationCode)
                .toList();

        // Check for station overlap
        boolean stationOverlap = tripStations.stream()
                .anyMatch(disturbedStations::contains);
        //Check for time overlap
        boolean timeOverlay = departureTime.isBefore(disruptionEnd) &&
                arrivalTime.isAfter(disruptionStart);
        return stationOverlap && timeOverlay;


//                tripInfo.getDepartureTime().isBefore(disruption.getEnd()) &&
//        tripInfo.getArrivalTime().isAfter(disruption.getStart());


    }


    @GetMapping("/getDisruptionsForTimeframe")
    public List<Disruption> getDisruptionsForTimeframe(
            @RequestParam String startStation,
            @RequestParam String endStation,
            @RequestParam String startDateTime,
            @RequestParam String endDateTime) {
        // Convert input date strings to ZonedDateTime
        LocalDateTime userStartDateTime = LocalDateTime.parse(startDateTime);
        LocalDateTime userEndDateTime = LocalDateTime.parse(endDateTime);

        // Get disruptions for the route
        List<Disruption> disruptionsOnRoute = DisruptionService.getDisruptionsByRoute(startStation, endStation, null);

        // Filter disruptions that fall within the given timeframe
        return disruptionsOnRoute.stream()
                .filter(disruption -> isDisruptionInTimeframe(disruption, userStartDateTime, userEndDateTime))
                .collect(Collectors.toList());
    }



//    private boolean isDisruptionInTimeFrame(Disruption disruption, ZonedDateTime userStart, ZonedDateTime userEnd) {
//        String startDateTime = disruption.getStart();
//        String endDateTIme = disruption.getEnd();
//        // Parse results
//        ZonedDateTime disruptionStart = DisruptionService.parseISODateTime(startDateTime);
//        ZonedDateTime disruptionEnd = DisruptionService.parseISODateTime(endDateTIme);
//
//        return !(userEnd.isBefore(disruptionStart)|| userStart.isAfter(disruptionEnd));
//    }




    private boolean isDisruptionInTimeframe(Disruption disruption, LocalDateTime userStart, LocalDateTime userEnd){
        String period = disruption.getPeriod();
        LocalDateTime[] disruptionPeriod = DisruptionService.parseDisruptionPeriod(period);

        LocalDateTime disruptionStart = disruptionPeriod[0];
        LocalDateTime disruptionEnd = disruptionPeriod[1];

        return !(userEnd.isBefore(disruptionStart) || userStart.isAfter(disruptionEnd));
    }

    private LocalDateTime parseInputDateTime(String dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        return LocalDateTime.parse(dateTime, formatter);
    }





//    @GetMapping("/getDisruptionByTime")
//    public Disruption[] getDisruptionByTime(@RequestParam String startStation,
//                                            @RequestParam String endStation,
//                                            @RequestParam String startDateTime,
//                                            @RequestParam String endDateTime){
//
//        LocalDateTime userStartDateTime = LocalDateTime.parse(startDateTime);
//        LocalDateTime userEndDateTime = LocalDateTime.parse(endDateTime);
//
//        // Get the disruptions along the route
//
//        List<Disruption> disruptionsOnRoute = getDisruptionsByRoute();
//
//        // Filter disruptions that fall within the given timeframe
////        return disruptionsOnRoute.stream()
////                .filter(disruption -> )
//
//
//        String stationCode = station.findStationCode(DestinationStation);
//        String url = baseUrl+"/station/"+stationCode;
//        HttpHeaders headers = new HttpHeaders();
//        headers.set(accessUserKey, getTripKey);
//        HttpEntity<String> entity = new HttpEntity<>(headers);
////        ObjectMapper objectMapper = new ObjectMapper();
//        ResponseEntity<Disruption[]> response = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                entity,
//                Disruption[].class
//        );
//        Disruption[] disruptions = response.getBody();
//        List<Disruption> disruptions1 = disruptionTimeList(disruptions,TimeFrame);
//
//
//        return response.getBody();
//    }

    @GetMapping("/getActiveDisruptions")
    public List<Disruption> getActiveDisruptions
            (@RequestParam(required = false) Boolean isActive){
        List<Disruption> response = DisruptionService.getAllDisruptions(isActive);

        System.out.println(response + " wtf");
        System.out.println(response.stream().count() +"/n ");


        return response;
    }

//    Notification Thing test
@GetMapping("TestingDisturbance")
public ResponseEntity<List<DisruptionResponse>> getDisruptionsByStation(
        @RequestParam String startStation,
        @RequestParam(required = false) String timeFrameFilter) {

    String stationCode = station.findStationCode(startStation);
    String url = nsAccess.disruptionStationBaseUrl() + stationCode;

    HttpHeaders headers = new HttpHeaders();
    headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsTripApiKey());
    HttpEntity<String> entity = new HttpEntity<>(headers);

    ResponseEntity<Disruption[]> response = restTemplate.exchange(
            url,
            HttpMethod.GET,
            entity,
            Disruption[].class
    );

    Disruption[] disruptions = response.getBody();

    if (disruptions != null) {
        // Convert disruptions to response format
        List<DisruptionResponse> disruptionResponses = disruptionService.getDisruptionDetails(disruptions);
        return ResponseEntity.ok(disruptionResponses);
    } else {
        return ResponseEntity.noContent().build();  // Return 204 No Content if no disruptions
    }
}
//    Notification Thing test

      @GetMapping("/getDisruptionByStation")
      public Disruption[] getDisruption(@RequestParam String startStation , @RequestParam String endStation,@RequestParam(required = false) String timeFrameFilter){

            Disruption[] response = DisruptionService.getDisruptionStations(startStation,timeFrameFilter);

//              System.out.println(response + " wtf");
//          System.out.println(response.length +"/n ");
//          System.out.println(Arrays.toString(response));

          return response;

//      return restTemplate.getForObject(url,entity, Disruption.class);
//      List<Disruption> jsonResponse = restTemplate.exchange(url, HttpMethod.GET,entity, String.class);

//      return restTemplate.exchange(url, HttpMethod.GET,entity, String.class); // Works
  }



  public List<Disruption> disruptionTimeList(Disruption[] disruptionsArr, String timeFrameFilter){

        if(disruptionsArr == null || disruptionsArr.length == 0){
            return Collections.emptyList();
        }
        else
        {
//            if (periodFilter == null || periodFilter.isEmpty()) {
//                return Arrays.asList(disruptionsArr);
//            }
        }
        List<Disruption> FilterDisruptions = Arrays.stream(disruptionsArr)
                .filter(disruption -> disruption.getStart().contains(timeFrameFilter))
                .collect(Collectors.toList());

        return FilterDisruptions;
  }



  //Get all disruptions in NS portal
    @GetMapping("/getDisruptions")
    public ResponseEntity getDisruptionAll(){
        String url = nsAccess.disruptionBaseUrl();

        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsTripApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
    }




}
