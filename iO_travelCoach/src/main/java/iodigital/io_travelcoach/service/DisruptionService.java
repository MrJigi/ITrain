package iodigital.io_travelcoach.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import iodigital.io_travelcoach.config.TokenConfig;
import iodigital.io_travelcoach.controller.DisruptionController;
import iodigital.io_travelcoach.dto.Response.Disruption.DisruptionResponse;
import iodigital.io_travelcoach.dto.Response.Disruption.*;
import iodigital.io_travelcoach.model.Disruption;
import iodigital.io_travelcoach.model.TripResponse;
import iodigital.io_travelcoach.script.Logger.LoggingUtil;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;
//import iodigital.io_travelcoach.service.connectingServices.TravelDisruptionService;
import iodigital.io_travelcoach.service.disruption.Consequence;
import iodigital.io_travelcoach.service.disruption.PublicationSection;
import iodigital.io_travelcoach.service.disruption.Section;
import iodigital.io_travelcoach.service.disruption.Station;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DisruptionService {

    private static final Logger log = LoggerFactory.getLogger(DisruptionService.class);
    private final RestTemplate restTemplate;
    private final NsAccess nsAccess;
    private final TokenConfig tokenConfig;
    private final StationCode stationService;

//    private final TravelDisruptionService travelDisruptionService;

//    @Autowired
//    private DisruptionController disruptionController;


    private ObjectMapper objectMapper = new ObjectMapper();

    public static final StationCode station = new StationCode();


//==================== Testing Disturbance on trip ==================================

//===================="/getDisruptions"==================================

    public ResponseEntity getAllDisturbances(){
        String url = nsAccess.disruptionBaseUrl();

        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsTripApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET,entity, Disruption.class);
    }
//========="/getDisruptionByStation"========= Testing Disturbance on trip ==================================

//    public List<Disruption> travelDisruptionCheck (String startStation,String endStation,String timeFrameFilter) {
//        // Step 1: Get the trip information (departure, destination, stops)
//
//        TripResponse tripInfo = travelDisruptionService.checkTravelAndDisruption(startStation,endStation);
//
//        // Step 2: Extract all stations (including intermediate stops) from the trip
//        List<String> stationsOnRoute =  extractStationsFromTrip(tripInfo);
//
//
//        // Step 3: Fetch disturbance data for the relevant stations
//        List<Disruption> allDisruptions = new ArrayList<>();
//
//        for (String station : stationsOnRoute) {
//            Disruption[] disruptions = getDisruptionsByRoute(station, endStation, timeFrameFilter).toArray(new Disruption[0]);  // Fetch disruptions for each station
//            allDisruptions.addAll(Arrays.asList(disruptions));
//        }
//
//        // Step 4: Filter out disruptions that overlap with the trip time
//        List<Disruption> relevantDisruptions = filterRelevantDisruptions(tripInfo, allDisruptions);
//
//        // Return only the disruptions that affect the trip
//        return relevantDisruptions;
//
//    }






// =============== Status: active ==== get All disturbances in a list ======
    public List<Disruption> disruptionList(){
        String url = nsAccess.disruptionsGetAll();

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
            List<Disruption> listOfDisruptions = Arrays.stream(disruptions).toList();
            return listOfDisruptions;

        // Should throw an empty list better

    }


//====== Status: Works ============== getDisruptionStation ==================================
    public ResponseEntity<List<DisruptionResponse>> disturbanceCheck (String startStation,String timeFrameFilter) {
        String stationCode = station.findStationCode(startStation);
        String url = nsAccess.disruptionStationBaseUrl(stationCode);

        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsTripApiKey());
        try {
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
                List<DisruptionResponse> disruptionResponses = this.getDisruptionDetails(disruptions);
                return ResponseEntity.ok(disruptionResponses);
            } else {
                return ResponseEntity.noContent().build();  // Return 204 No Content if no disruptions
            }
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


//==== status working on================/getDisruptionsForTimeframe ==================================
public List<Disruption> getDisruptionsForTimeframe(String startStation,String startTime){


        System.out.println(startTime);
    // Fix time frame bug with +not appearing in the format
    // input check up
    ZonedDateTime  userStartDateTime = parseISODateTime(startTime);
//    ZonedDateTime  userEndDateTime = parseISODateTime(endTime);
//    startStation = station.findStationCode(startStation);
//    endStation = station.findStationCode(endStation);
//==============================================================================
    // Okay i need to get several things in here
    // Need all info that is effected time stamp
    List<Disruption> disruptionsOnRoute;
    disruptionsOnRoute = disruptionList();
//   disruptionsOnRoute = getDisruptionsByRoute(startStation, endStation, null);
    // Filter disruptions that fall within the given timeframe
//    Need to make a custom response
    List<Disruption> parsedData = parseInTimeFrame(disruptionsOnRoute,startStation,userStartDateTime);

    return parsedData;
}

// ========= Helper method for getDisruptionsForTimeframe
//===Status: Works ================= Provide all stations with parameters :
                                                // startTime
                                                // endTime
                                                // StartStation
// ==================================

    public List<Disruption> parseInTimeFrame(List<Disruption> disruptions,String startStation,ZonedDateTime startTime) {
        List<Disruption> filteredDisruptions = new ArrayList<>();
        for (Disruption disruption : disruptions) {
//             && "CALAMITY".equalsIgnoreCase(disruption.getType())
//            if ("MAINTENANCE".equalsIgnoreCase(disruption.getType())) {
                //Can change this directly because its parsed ISOTIme
            ZonedDateTime  disruptionStart = parseISODateTime(disruption.getStart());
            ZonedDateTime  disruptionEnd = parseISODateTime(disruption.getEnd());
                filteredDisruptions.add(disruption);

//            }
        }
        return filteredDisruptions;
    }


    public Disruption[] getDisruptionByStation(String startStation, String timeFrameFilter) {
//        LocalDateTime userStartDateTime = LocalDateTime.parse(startDateTime);
//        LocalDateTime userEndDateTime = LocalDateTime.parse(endDateTime);

        String stationCode = station.findStationCode(startStation);
        String url = nsAccess.disruptionStationBaseUrl(stationCode);
        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsTripApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ObjectMapper objectMapper = new ObjectMapper();

        ResponseEntity<Disruption[]> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                Disruption[].class
        );
        Disruption[] disruptions = response.getBody();


        List<Disruption> disruptions1 = DisruptionService.disruptionsCheck(disruptions,timeFrameFilter);

//        LoggingUtil.logInfo("Disruption retrieved for station" + startStation,disruptions1.stream().collect(Collectors.toUnmodifiableList()));
        LoggingUtil.logInfo("Disruption retrieved for station" + Arrays.stream(disruptions).toList(),disruptions1.getFirst());
//        System.out.println(disruptions1.stream().toString());
    return disruptions;
    }




//    Testing out different way of streamming jsons


    public List<Disruption> getAllDisruptions(@RequestParam(required = false) Boolean isActive) {
//        LocalDateTime userStartDateTime = LocalDateTime.parse(startDateTime);
//        LocalDateTime userEndDateTime = LocalDateTime.parse(endDateTime);
        String url = nsAccess.disruptionBaseUrl();
        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsTripApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ObjectMapper objectMapper = new ObjectMapper();

        ResponseEntity<Disruption[]> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                Disruption[].class
        );
        Disruption[] disruptions = response.getBody();


        List<Disruption> disruptions1 = DisruptionService.disruptionRetrieve(disruptions,isActive);

//        LoggingUtil.logInfo("Disruption retrieved for station" + startStation,disruptions1.stream().collect(Collectors.toUnmodifiableList()));
//        LoggingUtil.logInfo("Disruption retrieved for station" + Arrays.stream(disruptions).toList(),disruptions1.getFirst());
//        System.out.println(disruptions1.stream().toString());
        return disruptions1;
    }

//    Testing out different way of streamming jsons

// Fix up the nsAccess endpoint by adding a station address parameter
    public List<Disruption> getDisruptionsWithHeaders(String stationName){

        String api= nsAccess.disruptionsGetAll() +"/station/"+ stationName;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsTripApiKey());

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Disruption[]> response = restTemplate.exchange(api, HttpMethod.GET, entity, Disruption[].class);

        System.out.println(response.getBody().toString());

        return Arrays.stream(response.getBody())
                .filter(disruption -> disruption.getTitle() != null && disruption.getTitle().contains(stationName))
                .collect(Collectors.toList());

    }

    //Get all Disturbances based on month input ex:{September}

    public static List<Disruption> disruptionsCheck(Disruption[] disruptionsArr, String periodFilter){
        if(disruptionsArr == null|| disruptionsArr.length == 0){
            return Collections.emptyList();
        }
        if (periodFilter == null || periodFilter.isEmpty()){
            return Arrays.asList(disruptionsArr);
        }

        List<Disruption> FilterDisruptions = Arrays.stream(disruptionsArr)
                .filter(disruption -> disruption.getPeriod().contains(periodFilter))
                .collect(Collectors.toList());

        return FilterDisruptions;
    }

    public static List<Disruption> disruptionRetrieve(Disruption[] disruptionsArr, Boolean isActive){
        if(disruptionsArr == null|| disruptionsArr.length == 0){
            return Collections.emptyList();
        }
        if (isActive == null ){
            return Arrays.asList(disruptionsArr);
        }

        List<Disruption> FilterDisruptions = Arrays.stream(disruptionsArr)
                .filter(disruption -> disruption.getIsActive() == isActive)
                .collect(Collectors.toList());

        return FilterDisruptions;
    }







    //Probably need to first select a station that I'm going (to/ from) to check for disruptions
    //Every 15 mins get an email sent to ya about notificatiosn
   @Scheduled(fixedRate = 900000 )
    public ResponseEntity<String> checkForDisruptions(@RequestParam String station) {
       String stationCode = stationService.findStationCode(station);
        String url = nsAccess.disruptionBaseUrl()+"station/"+stationCode+" ";

       HttpHeaders headers = new HttpHeaders();
       headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsPriceApiKey());
       HttpEntity<String> entity = new HttpEntity<>(headers);

       return restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
   }

   private List<Disruption> parseDisruptionResponse(String responseBody) {
       ObjectMapper objectMapper = new ObjectMapper();
       try{
           return Arrays.asList(objectMapper.readValue(responseBody,Disruption[].class));
       }
       catch (Exception e){
           e.printStackTrace();
       }
       return Collections.emptyList();
   }

   public List<Disruption> getDisruptionsByRoute(String startStation, String endStation, String filter){

        List<Disruption> tempList;
        tempList = this.getDisruptionsWithHeaders(startStation);

        return tempList;
    }

  /*  public String formatDateTimeToISO(String dateTime) {
        if (dateTime == null) {
            ZonedDateTime errorFormat = ZonedDateTime.now();
//            ZonedDateTime errorFormat = ZonedDateTime.parse("1999-09-19T19:19:19+01:00");  // ZonedDateTime with offset
            log.warn("Received null dateTime, needs extra handling");
            return errorFormat.toString();
        }

        // Step 1: Normalize input date-time string by removing any spaces before the timezone offset
        dateTime = dateTime.trim().replaceAll("(?<=\\d)\\s+", "+");

        // Step 2: Try parsing with flexible formats
        try {
            // DateTimeFormatter to handle different formats (with and without colon in the offset)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");

            // Parse the date-time string
            ZonedDateTime parsedDateTime = ZonedDateTime.parse(dateTime, formatter);

            // Step 3: Reformat the parsed ZonedDateTime into the desired format "yyyy-MM-dd'T'HH:mm:ss+HHmm"
            DateTimeFormatter desiredFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
            return parsedDateTime.format(desiredFormatter);  // This will format as +HHmm
        } catch (DateTimeParseException e) {
            log.warn("Failed to parse dateTime: " + dateTime, e);
            throw e;  // Handle exception as needed
        }
    }*/

    public ZonedDateTime parseISODateTime(String dateTime) {
//        dateTime = formatDateTimeToISO(dateTime);
        if (dateTime == null) {
            // Return a fallback value if the dateTime is null
//            Date format = 2024-11-21T13:28:00+0100
            ZonedDateTime errorFormat = ZonedDateTime.now();
//            ZonedDateTime errorFormat = ZonedDateTime.parse("1999-09-19T19:19:19+01:00");  // ZonedDateTime with offset
            log.warn("Received null dateTime, needs extra handling");
            return errorFormat;
        }

        // Clean up any space between time and timezone offset
        dateTime = dateTime.trim().replace(" ", "+");

        // Check if the string contains a timezone offset (e.g., +0100 or +02:00)
        if (dateTime.contains("+") || dateTime.contains("-")) {
            // Try parsing with ZonedDateTime (with offset)
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZZ");
                return ZonedDateTime.parse(dateTime, formatter);  // ZonedDateTime will correctly handle the offset
            } catch (DateTimeParseException e) {
                log.warn("Failed to parse dateTime as ZonedDateTime: " + dateTime, e);
                throw e;  // You can handle this exception as needed
            }
        } else {
            // Try parsing with LocalDateTime (no offset)
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                return ZonedDateTime.parse(dateTime, formatter);  // LocalDateTime if no offset is present
            } catch (DateTimeParseException e) {
                log.warn("Failed to parse dateTime as LocalDateTime: " + dateTime, e);
                throw e;  // You can handle this exception as needed
            }
        }
    }

//  public LocalDateTime parseISODateTime(String dateTime) {
//        if(dateTime == null){
//            LocalDateTime errorFormat = LocalDateTime.parse("1999-09-19T19:19:19+0100");
//            log.warn("Received null dateTime, needs extra handling");
//            return errorFormat;
//        }
//        // Example format: "2024-09-24T10:26:39+0200"
////        dateTime = dateTime.replace(" ", "");
//        LocalDateTime time;
//        if(!dateTime.contains("+")){
//            dateTime = dateTime.replace(" ", "+");
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
//            time = LocalDateTime.parse(dateTime, formatter);
//        }
//
//        else{
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
//            time = LocalDateTime.parse(dateTime, formatter);
//
//        }
//        return time;
////         ZonedDateTime zonedTime = ZonedDateTime.parse(dateTime, formatter);
//
//    }

    public static LocalDateTime[] parseDisruptionPeriod(String period) {
        String[] periodParts = period.split(" t/m ");

        // Assuming the format: "Dinsdag 24 september 10:00 uur"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM H:mm 'uur'", Locale.forLanguageTag("nl"));

        // Parse start and end periods
        LocalDateTime start = LocalDateTime.parse(periodParts[0].trim(), formatter);
        LocalDateTime end = LocalDateTime.parse(periodParts[1].trim(), formatter);

        return new LocalDateTime[]{start, end};
    }


   //Parse into a list of Disruptions
   public List<Disruption> parseDisruptionList(String responseBody) {
       try{
           return Arrays.asList(objectMapper.readValue(responseBody, Disruption[].class));
       }
       catch (Exception e){
           e.printStackTrace();
           return Collections.emptyList();
       }
   }


// This method is supposed to check through Disruption API for all station info to which are affected by maintenance
//It will itterate through PublicationSection and provide individual locations affected

    public List<DisruptionResponse> getDisruptionDetails(Disruption[] disruptions) {
        List<DisruptionResponse> disruptionResponses = new ArrayList<>();
        List<Disruption> disruptionsTest = new ArrayList<>();
        disruptionsTest.add(disruptions[0]);

        for (Disruption disruption : disruptionsTest) {
            DisruptionResponse response = new DisruptionResponse();
            response.setTitle(disruption.getTitle());

            response.setStartTime(disruption.getStart());
            response.setEndTime(disruption.getEnd());

            // Collect station info
            List<StationInformation> stationInfoList = new ArrayList<>();
            if (disruption.getPublicationSections() != null) {
                for (PublicationSection section : disruption.getPublicationSections()) {
                    Section affectedSection = section.getSection();
                    if (affectedSection != null && affectedSection.getStations() != null) {
                        for (Station station : affectedSection.getStations()) {
                            stationInfoList.add(new StationInformation(station.getName(), station.getStationCode(), station.getCountryCode(), station.getUicCode(),station.getCoordinate().getLat(),station.getCoordinate().getLng()));
                        }
                    }

                    // Add consequences
                    Consequence consequence = section.getConsequence();
                    if (consequence != null) {
                        response.setConsequenceDescription(consequence.getDescription());
                        response.setConsequenceLevel(consequence.getLevel());
                    }
                }
            }

            response.setAffectedStations(stationInfoList);
            disruptionResponses.add(response);
        }

        return disruptionResponses;
    }


    public Disruption[] getDisruptionStations(String startStation, String timeFrameFilter) {
        String stationCode = station.findStationCode(startStation);
        String url = nsAccess.disruptionBaseUrl() + "/station/" + stationCode;

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
            for (Disruption disruption : disruptions) {
                printDisruptionDetails(disruption);
            }
        }

        return disruptions;
    }


    public static void printDisruptionDetails(Disruption disruption) {
        String startTime = disruption.getStart();
        String endTime = disruption.getEnd();
        System.out.println("Disruption start time " + startTime);
        System.out.println("Disruption end time "+ endTime);

        //Iterations through publication section
        if(disruption.getPublicationSections() != null){
            for (PublicationSection publicationSection : disruption.getPublicationSections()) {
                Section affectedSection = publicationSection.getSection();
                if(affectedSection != null && affectedSection.getStations() != null){
                    System.out.println("Affected Stations : ");
                    for (Station station : affectedSection.getStations()) {
                        System.out.println("- Station Name: " + station.getName()+ " , Code: " + station.getStationCode());
                    }
                }

                //Print consequences, if any
                Consequence consequence = publicationSection.getConsequence();
                if(consequence != null){
                    System.out.println("Consequence: " + consequence.getDescription() + " (" + consequence.getLevel()+ " )");
                }

            }

        }
        else {
            System.out.println("Disruption publication sections is empty");
        }

    }


    //==================== Helper methods==================================
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


    public boolean isDisruptionInTimeframe(Disruption disruption, LocalDateTime userStart, LocalDateTime userEnd){
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

//==================== Helper methods  ==================================


//==================== Email Notificiations ==================================

    public String generateDisturbanceMessage(String track, String disturbanceDetails){
        return "Problems on " + track + " in Eindhoven with: " + disturbanceDetails;
    }


}
