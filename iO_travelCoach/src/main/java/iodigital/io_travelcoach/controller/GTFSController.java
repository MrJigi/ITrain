package iodigital.io_travelcoach.controller;

import iodigital.io_travelcoach.model.POJO.*;
import iodigital.io_travelcoach.service.gtfs.GtfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gtfs")
public class GTFSController {

    @Autowired
    private GtfsService gtfsService;

    @GetMapping("/stops")
    public List<Stops> getStops() {
        try{
             return gtfsService.processCsvFile();
        }
        catch (Exception e){
            return null;
        }

    }


    @GetMapping("/routes")
    public List<Routes> getRoutes() {
        try{
            return gtfsService.processRoutes();
        }
        catch (Exception e){
            return null;
        }

    }

    @GetMapping("/trips")
    public List<Trips> getTrips () {
        try{
            return gtfsService.processTrips();
        }
        catch (Exception e){
            return null;
        }

    }

    @GetMapping("/shape")
    public List<Shapes> getShapes () {
        try{
            return gtfsService.processShapes();
        }
        catch (Exception e){
            return null;
        }

    }

    @GetMapping("/stopTimes")
    public List<Stop_times> getStopTimes () {
        try{
            return gtfsService.processStopTimes();
        }
        catch (Exception e){
            return null;
        }

    }




}
