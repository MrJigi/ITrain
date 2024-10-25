package iodigital.io_travelcoach.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import iodigital.io_travelcoach.config.TokenConfig;
import iodigital.io_travelcoach.dto.Response.Disruption.DisruptionResponse;
import iodigital.io_travelcoach.dto.Response.Disruption.*;
import iodigital.io_travelcoach.model.Disruption;
import iodigital.io_travelcoach.script.Logger.LoggingUtil;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;
import iodigital.io_travelcoach.service.disruption.Consequence;
import iodigital.io_travelcoach.service.disruption.PublicationSection;
import iodigital.io_travelcoach.service.disruption.Section;
import iodigital.io_travelcoach.service.disruption.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class DisruptionService {


//    @Value("${ns.api.access.price.key}")
//    private String apiPriceKey;
//    @Value("${ns.api.access.trip.key}")
//    private String apiTripKey;
//    @Value("${ns.api.access.user.key}")
//    private String accessUserKey;
    private static final RestTemplate restTemplate = new RestTemplate();
    private static String baseUrl = "https://gateway.apiportal.ns.nl/disruptions/v3";
    private ObjectMapper objectMapper = new ObjectMapper();
    public static final NsAccess nsAccess = new NsAccess();

    public static TokenConfig tokenConfig;
    public static final StationCode station = new StationCode();

    @Autowired
    public DisruptionService(TokenConfig tokenConfig) {
        DisruptionService.tokenConfig = tokenConfig;
    }



    StationCode stationService = new StationCode();







    public static  Disruption[] getDisruptionByStation(String startStation, String timeFrameFilter) {
//        LocalDateTime userStartDateTime = LocalDateTime.parse(startDateTime);
//        LocalDateTime userEndDateTime = LocalDateTime.parse(endDateTime);

        String stationCode = station.findStationCode(startStation);
        String url = nsAccess.disruptionStationBaseUrl()+stationCode;
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


    public static List<Disruption> getAllDisruptions(@RequestParam(required = false) Boolean isActive) {
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
        LoggingUtil.logInfo("Disruption retrieved for station" + Arrays.stream(disruptions).toList(),disruptions1.getFirst());
//        System.out.println(disruptions1.stream().toString());
        return disruptions1;
    }

//    Testing out different way of streamming jsons


    public static List<Disruption> getDisruptionsWithHeaders(String stationName){

        String api= baseUrl +"/station/"+ stationName;
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
        String url = baseUrl+"station/"+stationCode+" ";

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

   public static List<Disruption> getDisruptionsByRoute(String startStation, String endStation, String filter){

        List<Disruption> tempList;
        tempList = getDisruptionsWithHeaders(startStation);

        return tempList;
    }

    public static ZonedDateTime parseISODateTime(String dateTime) {
        // Example format: "2024-09-24T10:26:39+0200"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
        return ZonedDateTime.parse(dateTime, formatter);
    }

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

        for (Disruption disruption : disruptions) {
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


    public static Disruption[] getDisruptionStations(String startStation, String timeFrameFilter) {
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




}
