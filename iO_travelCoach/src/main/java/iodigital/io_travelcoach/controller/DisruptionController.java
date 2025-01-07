package iodigital.io_travelcoach.controller;


//import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import iodigital.io_travelcoach.config.TokenConfig;

import iodigital.io_travelcoach.dto.Response.Disruption.DisruptionResponse;
import iodigital.io_travelcoach.model.Disruption;
import iodigital.io_travelcoach.model.TripResponse;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;

import iodigital.io_travelcoach.service.DisruptionService;
import iodigital.io_travelcoach.service.TravelService;

import iodigital.io_travelcoach.service.TripPlannerService;
import iodigital.io_travelcoach.service.disruption.Station;
import iodigital.io_travelcoach.service.notifications.NotificationService;
import lombok.AllArgsConstructor;
//import org.antlr.v4.runtime.Token;
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

import iodigital.io_travelcoach.service.DisruptionService.*;
@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@RestController
@RequestMapping("/api/disruption")
public class DisruptionController {

    private final DisruptionService disruptionService;

    private final NotificationService emailService;



    //   =======Status: Active=============== Check disturbance based on start station ======================
    @GetMapping("/getDisruptionStation")
    public ResponseEntity<List<DisruptionResponse>> getDisruptionsByStation(
            @RequestParam String startStation,
            @RequestParam(required = false) String timeFrameFilter) {
        return disruptionService.disturbanceCheck(startStation,timeFrameFilter);
    }



// There is 3 types of disruption calls to NS
//======================== Get all disturbances ========param-  =======================
@GetMapping("/getAll")
public List<Disruption> getAllDisruptions()
 {
     List<Disruption> responseEntity = disruptionService.disruptionList();
    return responseEntity;
}
//======================== Get all disturbances ========param- StationCode =======================
//======================== Get all disturbances ========param- IsActive station , type of disturbance=======================
//======================== Get single disruption =======param- TypeOfDisturbance , id =======================


//    My type of disturbances are based on various parameters

//    ====================== if the disturbance exists in the travel plan ===================
//@GetMapping("/checkDisturbanceOnTrip")
//public List<Disruption> checkForDisturbances(
//        @RequestParam String startStation,
//        @RequestParam String endStation,
//        @RequestParam String travelDateTime)
//{
//   return disruptionService.travelDisruptionCheck(startStation,endStation,travelDateTime);
//}

    // Need to get first 2 request of getting ns info
    // Ns Info of all disturbances
    // Ns Info of all disturbances from Start station

//    ====================== Get disturbances based on a time frames  =======================
@GetMapping("/getDisruptionsForTimeframe")
public List<Disruption> getDisruptionsForTimeframe(
        @RequestParam String startStation,
        @RequestParam String startDateTime) {
    // Convert input date strings to ZonedDateTime
  return disruptionService.getDisruptionsForTimeframe(startStation, startDateTime);
}

//    ====================== Get disturbances start and end time  =======================



    @GetMapping("/getActiveDisruptions")
    public List<Disruption> getActiveDisruptions
            (@RequestParam(required = false) Boolean isActive){
        List<Disruption> response = disruptionService.getAllDisruptions(isActive);
        return response;
    }

//    Notification Email test
    @PostMapping("/notify")
    public String notifyDisturbance(
            @RequestParam String track,
            @RequestParam String details,
            @RequestParam String recipient) {
        String message = disruptionService.generateDisturbanceMessage(track, details);
        emailService.sendEmail(recipient, "Train Track Disturbance Update", message);
        return "Disturbance notification sent successfully!";
    }



//  Disturption based on timeframe
      @GetMapping("/getDisruptionByStation")
      public Disruption[] getDisruption(@RequestParam String startStation , @RequestParam String endStation,@RequestParam(required = false) String timeFrameFilter){

            Disruption[] response = disruptionService.getDisruptionStations(startStation,timeFrameFilter);

          return response;
  }




  //Get all disruptions in NS portal
    @GetMapping("/getDisruptions")
    public ResponseEntity getDisruptionAll(){
        return disruptionService.getAllDisturbances();
    }
}
