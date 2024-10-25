package iodigital.io_travelcoach.service;

import iodigital.io_travelcoach.config.TokenConfig;

import iodigital.io_travelcoach.model.Destination;
import iodigital.io_travelcoach.model.tripPlanner.*;
import iodigital.io_travelcoach.model.Fares;
import iodigital.io_travelcoach.model.Origin;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class TripPlannerService {




    @Autowired
    public static final NsAccess nsAccess = new NsAccess();

    public static TokenConfig tokenConfig;
    public static final StationCode station = new StationCode();
    public TravelService travelService= new TravelService();


    public static TripDetails getTripDetails(List<FareLegs> fareLog) {
        List<FareLegs> travelLogs = new ArrayList<>();
        TripDetails tripDetails = new TripDetails(); // Assuming TripDetails is your return type

        if (fareLog != null && !fareLog.isEmpty()) {
            for (FareLegs travelPlans : fareLog) {
                FareLegs response = new FareLegs();
                List<Location> originList = new ArrayList<>();
                List<Location> destinationList = new ArrayList<>();
                List<Stop> stopList = new ArrayList<>();

                // Populate Origin
                List<Location> origins = travelPlans.getOrigin();
                if (origins != null) {
                    for (Location originLocation : origins) {
                        Location originDetails = new Location();
                        originDetails.setName(originLocation.getName());
                        originDetails.setLat(originLocation.getLat());
                        originDetails.setLng(originLocation.getLng());
                        originDetails.setActualDateTime(originLocation.getActualDateTime());
                        originDetails.setStationCode(originLocation.getStationCode());
                        originDetails.setUicCode(originLocation.getUicCode());
                        originList.add(originDetails);
                    }
                }
                response.setOrigin(originList);

                // Populate Destination
                List<Location> destinations = travelPlans.getDestination();
                if (destinations != null) {
                    for (Location destination : destinations) {
                        Location destinationDetails = new Location();
                        destinationDetails.setName(destination.getName());
                        destinationDetails.setLat(destination.getLat());
                        destinationDetails.setLng(destination.getLng());
                        destinationDetails.setActualDateTime(destination.getActualDateTime());
                        destinationDetails.setStationCode(destination.getStationCode());
                        destinationDetails.setUicCode(destination.getUicCode());
                        destinationList.add(destinationDetails);
                    }
                }
                response.setDestination(destinationList);

                // Set Operator
                response.setOperator(travelPlans.getOperator());

                // Extract Fare details
                List<Fare> fareList = new ArrayList<>();
                for (Fare fare : travelPlans.getFares()) {
                    Fare faresDetails = new Fare();
                    faresDetails.setPriceInCents(fare.getPriceInCents());
                    faresDetails.setDiscountType(fare.getDiscountType());
                    faresDetails.setProduct(fare.getProduct());
                    faresDetails.setTravelClass(fare.getTravelClass());
                    fareList.add(faresDetails);
                }
                response.setFares(fareList);

                // Add response to travel logs
                travelLogs.add(response);
            }
        }

        tripDetails.setFareLegs(travelLogs); // Assuming TripDetails has setFareLegs method
        return tripDetails;

    }

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
//                    faresDetails.setProduct(fare.getProduct());
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

