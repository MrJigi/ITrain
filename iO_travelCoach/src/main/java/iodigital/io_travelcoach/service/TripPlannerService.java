package iodigital.io_travelcoach.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import iodigital.io_travelcoach.config.TokenConfig;

import iodigital.io_travelcoach.model.TripResponse;
import iodigital.io_travelcoach.model.tripPlanner.NSDestination;
import iodigital.io_travelcoach.model.tripPlanner.*;
import iodigital.io_travelcoach.model.tripPlanner.TripResponse.ITLegResponse;
import iodigital.io_travelcoach.model.tripPlanner.TripResponse.ITStationResponse;
import iodigital.io_travelcoach.model.tripPlanner.TripResponse.ITStopResponse;
import iodigital.io_travelcoach.model.tripPlanner.TripResponse.ITTripResponse;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class TripPlannerService {

    private final RestTemplate restTemplate;
    private final NsAccess nsAccess;
    private final TokenConfig tokenConfig;
    private final StationCode stationCode;


//    public ResponseEntity<ITTripResponse> tripSummaryResponse(String startStation,String endStation) {
//        String originStation = stationCode.findStationCode(startStation);
//        String destinationStation = stationCode.findStationCode(endStation);
//        String url = nsAccess.reisInformatieStationToStation(originStation,destinationStation);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set(tokenConfig.getNsApiName(),tokenConfig.getNsTripApiKey());
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//
//        ResponseEntity<NSTripLayout> response = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                entity,
//                NSTripLayout.class
//        );
//        NSTripLayout TestResponse = response.getBody();
//        List<NSTrip> trips = new ArrayList<>();
//
//
//        if(TestResponse != null) {
////            ITTripResponse tripDetails = TripPlannerService.extractTripSummary(TestResponse);
////            System.out.println(tripDetails);
//            return ResponseEntity.ok(tripDetails);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    public ResponseEntity<NSTripLayout> tripPlannerStations( String startStation,String endStation){
        String originStation = stationCode.findStationCode(startStation);
        String destinationStation = stationCode.findStationCode(endStation);
        String url = nsAccess.reisInformatieStationToStation(originStation,destinationStation);

        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(),tokenConfig.getNsReisApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<NSTripLayout> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                NSTripLayout.class
        );
        NSTripLayout TestResponse = response.getBody();
        System.out.println(response.getBody());


        if(TestResponse != null) {
            NSTripLayout tripDetails = TripPlannerService.getTripLayout(TestResponse);
            System.out.println(tripDetails);
            return ResponseEntity.ok(tripDetails);
        } else {
            return ResponseEntity.notFound().build();
        }
    }




//    @Autowired
//    public TripPlannerService(RestTemplate restTemplate, NsAccess nsAccess, TokenConfig tokenConfig, StationCode stationCode) {
//        this.restTemplate = restTemplate;
//        this.nsAccess = nsAccess;
//        this.tokenConfig = tokenConfig;
//        this.stationCode = stationCode;
//    }

//    @Autowired
//    public static final NsAccess nsAccess = new NsAccess();
//
//    private static TokenConfig tokenConfig;
//    public final static StationCode station = new StationCode();
//    private TravelService travelService= new TravelService(nsAccess,station);




//===========================Extraction logic ====================================
//===============================================================
//===========================TripSummary Template ====================================
//===============================================================
//public static ITTripResponse extractTripSummary(NSTripLayout fareLog) {
//    ITTripResponse tripResponses = new ITTripResponse();
//
//    if (fareLog != null && fareLog.getNSTrips() != null) {
////        NSTrip tripInfo =
//        List<NSTrip> trips = new ArrayList<>();
//        for (NSTrip trip : fareLog.getNSTrips()) {
//            ITTripResponse tripResponse = new ITTripResponse();
//            tripResponse.setTotalDurationInMinutes(trip.getPlannedDurationInMinutes());
//
//            List<ITLegResponse> legResponses = new ArrayList<>();
//            for (NSLegs leg : trip.getLegs()) {
//                ITLegResponse legResponse = new ITLegResponse();
//                legResponse.setTravelType(leg.getTravelType());
//
//                // Map Origin
//                NSOrigin origin = leg.getNSOrigin();
//                if (origin != null) {
//                    ITStationResponse originResponse = new ITStationResponse();
//                    originResponse.setName(origin.getName());
//                    originResponse.setPlannedDateTime(origin.getPlannedDateTime());
//                    legResponse.setOrigin(originResponse);
//                }
//
//                // Map Destination
//                NSDestination destination = leg.getNSDestination();
//                if (destination != null) {
//                    ITStationResponse destinationResponse = new ITStationResponse();
//                    destinationResponse.setName(destination.getName());
//                    destinationResponse.setPlannedDateTime(destination.getPlannedDateTime());
//                    legResponse.setDestination(destinationResponse);
//                }
//
//                // Map Stops
//                List<ITStopResponse> stopResponses = new ArrayList<>();
//                if (leg.getNSStops() != null) {
//                    for (NSStop stop : leg.getNSStops()) {
//                        ITStopResponse stopResponse = new ITStopResponse();
//                        stopResponse.setName(stop.getName());
//                        stopResponse.setPlannedArrivalDateTime(stop.getPlannedDepartureDateTime());
//                        stopResponse.setCancelled(stop.isCancelled());
//                        stopResponse.setLat(stop.getLat());
//                        stopResponse.setLng(stop.getLng());
//                        stopResponses.add(stopResponse);
//                    }
//                }
//                legResponse.setStops(stopResponses);
//
//                // Add to leg responses
//                legResponses.add(legResponse);
//            }
//            tripResponse.setLegs(legResponses);
//            tripResponses.add(tripResponse);
//        }
//    }
//
//    return tripResponses;
//}

    //===========================NSTRIP Template ====================================
//===============================================================
//
//    public static NSTripLayout getTripLayout(NSTripLayout fareLog) {
//        NSTripLayout travelLogs = new NSTripLayout();
//
//        if (fareLog != null) {
//            travelLogs.setSource(fareLog.getSource());
//
//            List<NSTrip> trips = new ArrayList<>();
//// Iterating through Trips nest==========================================================================
//            for (NSTrip travelPlans : fareLog.getNSTrips()) {
//                NSTrip trip = new NSTrip();
//                trip.setIdx(travelPlans.getIdx());
//                trip.setUid(travelPlans.getUid());
//                trip.setCtxRecon(travelPlans.getCtxRecon());
//                trip.setSourceCtxRecon(travelPlans.getSourceCtxRecon());
//                trip.setPlannedDurationInMinutes(travelPlans.getPlannedDurationInMinutes());
//                trip.setActualDurationInMinutes(travelPlans.getActualDurationInMinutes());
//                trip.setTransfers(travelPlans.getTransfers());
//                trip.setStatus(travelPlans.getStatus());
//                trip.setMessages(travelPlans.getMessages());
//
//                trips.add(trip);
//
//
//                List<NSLegs> legsList = new ArrayList<>();
//// Iterating through Legs nest==========================================================================
//
//                for (NSLegs leg : travelPlans.getLegs()) {
//
//                    NSLegs NSLegsInfo = new NSLegs();
//                    NSLegsInfo.setIdx(leg.getIdx());
//                    NSLegsInfo.setName(leg.getName());
//                    NSLegsInfo.setTravelType(leg.getTravelType());
//                    NSLegsInfo.setPartCancelled(leg.getPartCancelled());
//                    NSLegsInfo.setDirection(leg.getDirection());
//                    NSLegsInfo.setCancelled(leg.getCancelled());
//                    NSLegsInfo.setNSMessages(leg.getNSMessages());
//
//                    legsList.add(NSLegsInfo);
//// Populate Origin nest ===========================================================================
//                    NSOrigin NSOriginLocation = leg.getNSOrigin();
//                    if (NSOriginLocation != null) {
//                        NSOrigin NSOriginDetails = new NSOrigin();
//                        NSOriginDetails.setCountryCode(NSOriginLocation.getCountryCode());
//                        NSOriginDetails.setType(NSOriginLocation.getType());
//                        NSOriginDetails.setPlannedTrack(NSOriginLocation.getPlannedTrack());
//                        NSOriginDetails.setActualDateTime(NSOriginLocation.getActualDateTime());
//                        NSOriginDetails.setPlannedTimeZoneOffset(NSOriginLocation.getPlannedTimeZoneOffset());
//                        NSOriginDetails.setActualTrack(NSOriginLocation.getActualTrack());
//                        NSOriginDetails.setCheckinStatus(NSOriginLocation.getCheckinStatus());
//                        NSOriginDetails.setNotes(NSOriginLocation.getNotes());
//                        NSOriginDetails.setPlannedDateTime(NSOriginLocation.getPlannedDateTime());
//                        NSOriginDetails.setActualTimeZoneOffset(NSOriginLocation.getActualTimeZoneOffset());
//                        NSOriginDetails.setName(NSOriginLocation.getName());
//                        NSOriginDetails.setLat(NSOriginLocation.getLat());
//                        NSOriginDetails.setLng(NSOriginLocation.getLng());
//                        NSOriginDetails.setStationCode(NSOriginLocation.getStationCode());
//                        NSOriginDetails.setUicCode(NSOriginLocation.getUicCode());
//                        NSLegsInfo.setNSOrigin(NSOriginDetails);
//                    }
//
//                    // Populate Destination===========================================================================
//                    NSDestination NSDestinationLocation = leg.getNSDestination();
//                    if (NSDestinationLocation != null) {
//                        NSDestination NSDestinationDetails = new NSDestination();
//                        NSDestinationDetails.setName(NSDestinationLocation.getName());
//                        NSDestinationDetails.setLat(NSDestinationLocation.getLat());
//                        NSDestinationDetails.setLng(NSDestinationLocation.getLng());
//                        NSDestinationDetails.setCountryCode(NSDestinationLocation.getCountryCode());
//                        NSDestinationDetails.setType(NSDestinationLocation.getType());
//                        NSDestinationDetails.setPlannedTrack(NSDestinationLocation.getPlannedTrack());
//                        NSDestinationDetails.setPlannedTimeZoneOffset(NSDestinationLocation.getPlannedTimeZoneOffset());
//                        NSDestinationDetails.setActualTimeZoneOffset(NSDestinationLocation.getActualTimeZoneOffset());
//                        NSDestinationDetails.setPlannedDateTime(NSDestinationLocation.getPlannedDateTime());
//                        NSDestinationDetails.setActualTrack(NSDestinationLocation.getActualTrack());
//                        NSDestinationDetails.setExitSide(NSDestinationLocation.getExitSide());
//                        NSDestinationDetails.setCheckinStatus(NSDestinationLocation.getCheckinStatus());
//                        NSDestinationDetails.setNotes(NSDestinationLocation.getNotes());
//                        NSDestinationDetails.setActualDateTime(NSDestinationLocation.getActualDateTime());
//                        NSDestinationDetails.setStationCode(NSDestinationLocation.getStationCode());
//                        NSDestinationDetails.setUicCode(NSDestinationLocation.getUicCode());
//                    // set the list with values
//                        NSLegsInfo.setNSDestination(NSDestinationDetails);
//                    }
//
//
//
//                    //Populate stops===========================================================================
//                    List<NSStop> NSStopsList = new ArrayList<>();
//                    List<NSStop> NSStops = leg.getNSStops();
//                    if (NSStops != null) {
//                        for (NSStop NSStop : NSStops) {
//                            NSStop NSStopDetails = new NSStop();
//                            NSStopDetails.setUicCode(NSStop.getUicCode());
//                            NSStopDetails.setName(NSStop.getName());
//                            NSStopDetails.setLat(NSStop.getLat());
//                            NSStopDetails.setLng(NSStop.getLng());
//                            NSStopDetails.setCountryCode(NSStop.getCountryCode());
//                            NSStopDetails.setNotes(NSStop.getNotes());
//                            NSStopDetails.setRouteIdx(NSStop.getRouteIdx());
//                            NSStopDetails.setPlannedDepartureDateTime(NSStop.getPlannedDepartureDateTime());
//                            NSStopDetails.setPlannedDepartureTimeZoneOffset(NSStop.getPlannedDepartureTimeZoneOffset());
//                            NSStopDetails.setActualDepartureDateTime(NSStop.getActualDepartureDateTime());
//                            NSStopDetails.setCancelled(NSStop.isCancelled());
//                            NSStopDetails.setBorderStop(NSStop.isBorderStop());
//                            NSStopDetails.setActualArrivalTrack(NSStop.getActualArrivalTrack());
//                            NSStopDetails.setActualDepartureTrack(NSStop.getActualDepartureTrack());
//                            NSStopDetails.setPlannedDepartureTrack(NSStop.getPlannedDepartureTrack());
//                            NSStopDetails.setPlannedArrivalTrack(NSStop.getPlannedArrivalTrack());
//                            NSStopDetails.setPassing(NSStop.isPassing());
//
//                            // Add the populated stop to the list
//                            NSStopsList.add(NSStopDetails);
//                        }
//                        NSLegsInfo.setNSStops(NSStopsList);  // Set the stops list in NSLegsInfo
//                    }
//// Populate Product nest ===========================================================================
//                    NSProduct NSProductsList = leg.getNSProduct();
//                    if (NSProductsList != null) {
//                        NSProduct NSProductDetails = new NSProduct();
//                        NSProductDetails.setProductType(NSProductsList.getProductType());
//                        NSProductDetails.setNumber(NSProductsList.getNumber());
//                        NSProductDetails.setCategoryCode(NSProductsList.getCategoryCode());
//                        NSProductDetails.setShortCategoryName(NSProductsList.getShortCategoryName());
//                        NSProductDetails.setLongCategoryName(NSProductsList.getLongCategoryName());
//                        NSProductDetails.setOperatorCode(NSProductsList.getOperatorCode());
//                        NSProductDetails.setOperatorName(NSProductsList.getOperatorName());
//                        NSProductDetails.setOperatorAdministrativeCode(NSProductsList.getOperatorAdministrativeCode());
//                        NSProductDetails.setType(NSProductsList.getType());
//                        NSProductDetails.setDisplayName(NSProductsList.getDisplayName());
////                        NSProductDetails.setNotes(NSProductsList.getNotes());
//                        //Add products to the list
//                        NSLegsInfo.setNSProduct(NSProductDetails);
//
//
//                    }
//
//
//
//                    // Add NSLegsInfo to legs list
//                    legsList.add(NSLegsInfo);
//                }
//
//                // Set legs in current trip and add to trips list
//                trip.setLegs(legsList);
//                trips.add(trip);
//            }
//
//            // Set trips in travelLogs
//            travelLogs.setNSTrips(trips);
//        }
//
//        return travelLogs;
//    }






//=============================================================== Test rewrite
public static NSTripLayout getTripLayout(NSTripLayout fareLog) {
    NSTripLayout travelLogs = new NSTripLayout();

    if (fareLog != null) {
        travelLogs.setSource(fareLog.getSource());

        List<NSTrip> trips = new ArrayList<>();
        // Iterating through Trips nest
        for (NSTrip travelPlans : fareLog.getNSTrips()) {
            NSTrip trip = new NSTrip();
            trip.setIdx(travelPlans.getIdx());
            trip.setUid(travelPlans.getUid());
            trip.setCtxRecon(travelPlans.getCtxRecon());
            trip.setSourceCtxRecon(travelPlans.getSourceCtxRecon());
            trip.setPlannedDurationInMinutes(travelPlans.getPlannedDurationInMinutes());
            trip.setActualDurationInMinutes(travelPlans.getActualDurationInMinutes());
            trip.setTransfers(travelPlans.getTransfers());
            trip.setStatus(travelPlans.getStatus());
            trip.setMessages(travelPlans.getMessages());
            trip.setFareLegs(travelPlans.getFareLegs());


//            NSFareLegs nsFareLegs = trip.getFares();
//            if (nsFareLegs != null) {
//                trip.setFares(mapNSProduct(nsFareLegs));
//            }
            for(NSFareLegs fareLegs: travelPlans.getFareLegs()){

                NSFareLegs nsFareLegsInfo = new NSFareLegs();
            }


            List<NSLegs> legsList = new ArrayList<>();
            // Iterating through Legs nest
            for (NSLegs leg : travelPlans.getLegs()) {

                NSLegs NSLegsInfo = new NSLegs();
                NSLegsInfo.setIdx(leg.getIdx());
                NSLegsInfo.setName(leg.getName());
                NSLegsInfo.setTravelType(leg.getTravelType());
                NSLegsInfo.setPartCancelled(leg.getPartCancelled());
                NSLegsInfo.setDirection(leg.getDirection());
                NSLegsInfo.setCancelled(leg.getCancelled());
                NSLegsInfo.setNSMessages(leg.getNSMessages());
                NSLegsInfo.setPlannedDurationInMinutes(leg.getPlannedDurationInMinutes());
                legsList.add(NSLegsInfo);

                // Populate Origin nest
                NSOrigin NSOriginLocation = leg.getNSOrigin();
                if (NSOriginLocation != null) {
                    NSLegsInfo.setNSOrigin(mapNSOrigin(NSOriginLocation));
                }

                // Populate Destination
                NSDestination NSDestinationLocation = leg.getNSDestination();
                if (NSDestinationLocation != null) {
                    NSLegsInfo.setNSDestination(mapNSDestination(NSDestinationLocation));
                }

                // Populate stops
                List<NSStop> NSStopsList = new ArrayList<>();
                List<NSStop> NSStops = leg.getNSStops();
                if (NSStops != null) {
                    for (NSStop NSStop : NSStops) {
                        NSStopsList.add(mapNSStop(NSStop));
                    }
                    NSLegsInfo.setNSStops(NSStopsList);  // Set the stops list in NSLegsInfo
                }

                // Populate Product nest
                NSProduct NSProductsList = leg.getNSProduct();
                if (NSProductsList != null) {
                    NSLegsInfo.setNSProduct(mapNSProduct(NSProductsList));
                }

                //Populate Fare nest
//                NSFareLegs NSFareList = leg.get
            }

            // Set legs in current trip and add to trips list
            trip.setLegs(legsList);
            trips.add(trip);
        }



        // Set trips in travelLogs
        travelLogs.setNSTrips(trips);
    }

    return travelLogs;
}

    // Helper Methods to Avoid Duplication
    private static NSOrigin mapNSOrigin(NSOrigin original) {
        NSOrigin mapped = new NSOrigin();
        mapped.setCountryCode(original.getCountryCode());
        mapped.setType(original.getType());
        mapped.setPlannedTrack(original.getPlannedTrack());
        mapped.setActualDateTime(original.getActualDateTime());
        mapped.setPlannedTimeZoneOffset(original.getPlannedTimeZoneOffset());
        mapped.setActualTrack(original.getActualTrack());
        mapped.setCheckinStatus(original.getCheckinStatus());
        mapped.setNotes(original.getNotes());
        mapped.setPlannedDateTime(original.getPlannedDateTime());
        mapped.setActualTimeZoneOffset(original.getActualTimeZoneOffset());
        mapped.setName(original.getName());
        mapped.setLat(original.getLat());
        mapped.setLng(original.getLng());
        mapped.setStationCode(original.getStationCode());
        mapped.setUicCode(original.getUicCode());
        return mapped;
    }

    private static NSDestination mapNSDestination(NSDestination original) {
        NSDestination mapped = new NSDestination();
        mapped.setName(original.getName());
        mapped.setLat(original.getLat());
        mapped.setLng(original.getLng());
        mapped.setCountryCode(original.getCountryCode());
        mapped.setType(original.getType());
        mapped.setPlannedTrack(original.getPlannedTrack());
        mapped.setPlannedTimeZoneOffset(original.getPlannedTimeZoneOffset());
        mapped.setActualTimeZoneOffset(original.getActualTimeZoneOffset());
        mapped.setPlannedDateTime(original.getPlannedDateTime());
        mapped.setActualTrack(original.getActualTrack());
        mapped.setExitSide(original.getExitSide());
        mapped.setCheckinStatus(original.getCheckinStatus());
        mapped.setNotes(original.getNotes());
        mapped.setActualDateTime(original.getActualDateTime());
        mapped.setStationCode(original.getStationCode());
        mapped.setUicCode(original.getUicCode());
        return mapped;
    }

    private static NSStop mapNSStop(NSStop original) {
        NSStop mapped = new NSStop();
        mapped.setUicCode(original.getUicCode());
        mapped.setName(original.getName());
        mapped.setLat(original.getLat());
        mapped.setLng(original.getLng());
        mapped.setCountryCode(original.getCountryCode());
        mapped.setNotes(original.getNotes());
        mapped.setRouteIdx(original.getRouteIdx());
        mapped.setPlannedDepartureDateTime(original.getPlannedDepartureDateTime());
        mapped.setPlannedDepartureTimeZoneOffset(original.getPlannedDepartureTimeZoneOffset());
        mapped.setActualDepartureDateTime(original.getActualDepartureDateTime());
        mapped.setCancelled(original.isCancelled());
        mapped.setBorderStop(original.isBorderStop());
        mapped.setActualArrivalTrack(original.getActualArrivalTrack());
        mapped.setActualDepartureTrack(original.getActualDepartureTrack());
        mapped.setPlannedDepartureTrack(original.getPlannedDepartureTrack());
        mapped.setPlannedArrivalTrack(original.getPlannedArrivalTrack());
        mapped.setPassing(original.isPassing());
        return mapped;
    }

    private static NSProduct mapNSProduct(NSProduct original) {
        NSProduct mapped = new NSProduct();
        mapped.setProductType(original.getProductType());
        mapped.setNumber(original.getNumber());
        mapped.setCategoryCode(original.getCategoryCode());
        mapped.setShortCategoryName(original.getShortCategoryName());
        mapped.setLongCategoryName(original.getLongCategoryName());
        mapped.setOperatorCode(original.getOperatorCode());
        mapped.setOperatorName(original.getOperatorName());
        mapped.setOperatorAdministrativeCode(original.getOperatorAdministrativeCode());
        mapped.setType(original.getType());
        mapped.setDisplayName(original.getDisplayName());
        return mapped;
    }

    private static NSFareLegs mapNSFare(NSFareLegs original){
        NSFareLegs mapped = new NSFareLegs();
        mapped.setFares(original.getFares());
        mapped.setFareOrigin(original.getFareOrigin());
        mapped.setOperator(original.getOperator());
        mapped.setFareDestination(original.getFareDestination());
        return mapped;
    }

//===============================================================

//    public static NSTripLayout getTripLayout(NSTripLayout fareLog) {
//
//        NSTripLayout travelLogs = new NSTripLayout();
//
//
//        if (fareLog != null) {
//
//            List<NSTrip> NSTrip = new ArrayList<>();
//
//            for (NSTrip travelPlans : fareLog.getNSTrips()) {
////            NSTrip NSTrip = new NSTrip();
//
//                NSTripLayout response = new NSTripLayout();
//                List<NSOrigin> NSOriginList = new ArrayList<>();
//                List<NSDestination> NSDestinationList = new ArrayList<>();
//                List<NSStop> NSStopList = new ArrayList<>();
//
//                NSLegs NSLegsInfo = new NSLegs();
////              Here starts dissecting the nested arrays with Origin destination, NSProduct,Stops
//                for (NSLegs leg : travelPlans.getLegs()) {
//                    // Populate Origin
//                    NSOrigin NSOriginLocation = leg.getNSOrigin();
//                    if (NSOriginLocation != null) {
//
//                            NSOrigin NSOriginDetails = new NSOrigin();
//                            NSOriginDetails.setName(leg.getNSOrigin().getName());
//                            NSOriginDetails.setLat(NSOriginLocation.getLat());
//                            NSOriginDetails.setLng(NSOriginLocation.getLng());
//                            NSOriginDetails.setActualDateTime(NSOriginLocation.getActualDateTime());
//                            NSOriginDetails.setStationCode(NSOriginLocation.getStationCode());
//                            NSOriginDetails.setUicCode(NSOriginLocation.getUicCode());
//                            NSOriginList.add(NSOriginDetails);
//
//                    }
//
//                    // Populate Destination
//
//                    NSDestination NSDestination = leg.getNSDestination();
////                List<Destination> destinations = travelPlans.getDestination();
//                    if (leg.NSDestination != null) {
//
//                            NSDestination NSDestinationDetails = new NSDestination();
//                            NSDestinationDetails.setName(NSDestination.getName());
//                            NSDestinationDetails.setLat(NSDestination.getLat());
//                            NSDestinationDetails.setLng(NSDestination.getLng());
//                            NSDestinationDetails.setActualDateTime(NSDestination.getActualDateTime());
//                            NSDestinationDetails.setStationCode(NSDestination.getStationCode());
//                            NSDestinationDetails.setUicCode(NSDestination.getUicCode());
//                            NSDestinationList.add(NSDestinationDetails);
//
//                    }
//
//
//
//
//                    /*NSLegsInfo.setNSOrigin(NSOriginDetails);*/
//                }
//
//            }
//        }
//
//            return travelLogs;
//
//        }


//===================Fare price section========================


//
//                     Set Operator
//                response.setOperator(travelPlans.getOperator());
//
//                     Extract Fare details
//                List<Fare> fareList = new ArrayList<>();
//                for (Fare fare : travelPlans.getFares()) {
//                    Fare faresDetails = new Fare();
//                    faresDetails.setPriceInCents(fare.getPriceInCents());
//                    faresDetails.setDiscountType(fare.getDiscountType());
//                    faresDetails.setNSProduct(fare.getNSProduct());
//                    faresDetails.setTravelClass(fare.getTravelClass());
//                    fareList.add(faresDetails);
//                }
//                response.setFares(fareList);
//
//                     Add response to travel logs
//                    travelLogs = response;
//===========================================

//    public static TripDetails getTripDetails(List<FareLegs> fareLog) {
//
//        List<FareLegs> travelLogs = new ArrayList<>();
//        TripDetails tripDetails = new TripDetails(); // Assuming TripDetails is your return type
//
//        if (fareLog != null && !fareLog.isEmpty()) {
//            for (FareLegs travelPlans : fareLog) {
//                FareLegs response = new FareLegs();
//                List<Origin> originList = new ArrayList<>();
//                List<Destination> destinationList = new ArrayList<>();
//                List<Stop> stopList = new ArrayList<>();
//
//                // Populate Origin
//                List<Origin> origins = travelPlans.getOrigin();
//                if (origins != null) {
//                    for (Origin originLocation : origins) {
//                        Origin originDetails = new Origin();
//                        originDetails.setName(originLocation.getName());
//                        originDetails.setLat(originLocation.getLat());
//                        originDetails.setLng(originLocation.getLng());
//                        originDetails.setActualDateTime(originLocation.getActualDateTime());
//                        originDetails.setStationCode(originLocation.getStationCode());
//                        originDetails.setUicCode(originLocation.getUicCode());
//                        originList.add(originDetails);
//                    }
//                }
//                response.setOrigin(originList);
//
//                // Populate Destination
//                List<Destination> destinations = travelPlans.getDestination();
//                if (destinations != null) {
//                    for (Destination destination : destinations) {
//                        Destination destinationDetails = new Destination();
//                        destinationDetails.setName(destination.getName());
//                        destinationDetails.setLat(destination.getLat());
//                        destinationDetails.setLng(destination.getLng());
//                        destinationDetails.setActualDateTime(destination.getActualDateTime());
//                        destinationDetails.setStationCode(destination.getStationCode());
//                        destinationDetails.setUicCode(destination.getUicCode());
//                        destinationList.add(destinationDetails);
//                    }
//                }
//                response.setDestination(destinationList);
//
//                // Set Operator
//                response.setOperator(travelPlans.getOperator());
//
//                // Extract Fare details
////                List<Fare> fareList = new ArrayList<>();
////                for (Fare fare : travelPlans.getFares()) {
////                    Fare faresDetails = new Fare();
////                    faresDetails.setPriceInCents(fare.getPriceInCents());
////                    faresDetails.setDiscountType(fare.getDiscountType());
////                    faresDetails.setNSProduct(fare.getNSProduct());
////                    faresDetails.setTravelClass(fare.getTravelClass());
////                    fareList.add(faresDetails);
////                }
////                response.setFares(fareList);
//
//                // Add response to travel logs
//                travelLogs.add(response);
//            }
//        }
//
//        tripDetails.setFareLegs(travelLogs); // Assuming TripDetails has setFareLegs method
//        return tripDetails;
//
//    }

//
//    public static List<FareLegs> getTripPlanner(List<FareLegs> fareLog) {
//        List<FareLegs> travelLogs = new ArrayList<>();
//
//        if (fareLog != null && fareLog.size() > 0) {
//            for (FareLegs travelPlans : fareLog) {
//                FareLegs response = new FareLegs();
//                List<Origin> originList = new ArrayList<>();
//
////                Set Origin // Not everything used
//                for (Origin origin : travelPlans.getTravelOrigin()) {
//                    Origin originDetails = new Origin();
//                    originDetails.setName(origin.getName());
//                    originDetails.setLat(origin.getLat());
//                    originDetails.setLng(origin.getLng());
//                    originDetails.setActualDateTime(origin.getActualDateTime());
//                    originDetails.setStationCode(origin.getStationCode());
//                    originDetails.setUicCode(origin.getUicCode());
//                    originDetails.setStationCode(origin.getStationCode());
//                    originList.add(originDetails);
//                }
//                response.setTravelOrigin(originList);
//                List<Destination> destinationList = new ArrayList<>();
////                Set Destination
//
//                for (Destination destination : travelPlans.getTravelDestination()) {
//                    Destination destinationDetails = new Destination();
//
//                    destinationDetails.setName(destination.getName());
//                    destinationDetails.setLat(destination.getLat());
//                    destinationDetails.setLng(destination.getLng());
//                    destinationDetails.setActualDateTime(destination.getActualDateTime());
//                    destinationDetails.setStationCode(destination.getStationCode());
//                    destinationDetails.setUicCode(destination.getUicCode());
//                    destinationDetails.setStationCode(destination.getStationCode());
//
//                    destinationList.add(destinationDetails);
//                }
//                response.setTravelDestination(destinationList);
//
//                //                Set Fares
//
//
//                response.setOperator(travelPlans.getOperator());
//
//                //Extract Fare details
//                List<Fares> fareList = new ArrayList<>();
//                for (Fares fare : travelPlans.getFarePrices()) {
//                    Fares faresDetails = new Fares();
//                    faresDetails.setPriceInCents(fare.getPriceInCents());
//                    faresDetails.setDiscountType(fare.getDiscountType());
//                    faresDetails.setNSProduct(fare.getNSProduct());
//                    faresDetails.setTravelClass(fare.getTravelClass());
//                    fareList.add(faresDetails);
//                }
//                response.setFarePrices(fareList);
//                travelLogs.add(response);
//
//                return travelLogs;
//            }
//        }
//        return travelLogs;
//    }


}

