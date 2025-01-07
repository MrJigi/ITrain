package iodigital.io_travelcoach.service.connectingServices;

import iodigital.io_travelcoach.controller.TravelController;
import iodigital.io_travelcoach.model.TripResponse;
import iodigital.io_travelcoach.service.DisruptionService;
import iodigital.io_travelcoach.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//
//@Service
//public class TravelDisruptionService {
//
//    private final TravelService travelService;
//    private final DisruptionService disruptionService;
//
//    @Autowired
//    public TravelDisruptionService(TravelService travelService, DisruptionService disruptionService) {
//        this.travelService = travelService;
//        this.disruptionService = disruptionService;
//    }
//
//    public TripResponse checkTravelAndDisruption(String start, String end) {
//        return travelService.getInfoForTrip(start,end);
//        // Logic to check both travel and disruption
//    }
//}
