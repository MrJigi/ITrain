package iodigital.io_travelcoach.controller;

import iodigital.io_travelcoach.model.Arrival;
import iodigital.io_travelcoach.model.Payload;
import iodigital.io_travelcoach.model.Product;
import iodigital.io_travelcoach.script.StationCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TrainController {

    StationCode station = new StationCode();


    @GetMapping("/extractTrainCodes")
    public String getTrainCodes() {
        List<String> trainCodes = new ArrayList<>();
        station.mainThing();
        trainCodes.addAll(trainCodes);
        return trainCodes.toString();
    }

    @GetMapping("/getStation")
    public String stationCodeReq(@RequestParam(value = "stationName") String stationName) {
        return station.findStationCode(stationName);

    }

    @GetMapping("/stationCodes")
    public Map<String,String> getStationCodes() {
       return station.stationMapObj();
    }

    @GetMapping("/arrivals")
    public Payload getArrivals(){
        List<Arrival> arrivals = new ArrayList<>();
        //sample ex.
        Product product = new Product(
                "123",
                "catCode",
                "cat",
                "category",
                "opName",
                "opCode",
                "type"
        );

        Arrival arive =  new Arrival(
                "2024-09-17T09:54:00+0200", // plannedDateTime
                120,                         // plannedTimeZoneOffset
                "2024-09-17T09:54:00+0200",  // actualDateTime
                120,                         // actualTimeZoneOffset
                "1",                         // plannedTrack
                "1",                         // actualTrack
                product,                     // product (created above)
                "SPR",                       // trainCategory
                false,                       // cancelled
                new ArrayList<>(),           // messages (empty list)
                "INCOMING",                  // arrivalStatus
                "Weert",                     // origin
                "NS 6434"                    // name
        );

        arrivals.add(arive);
        //add more arrivals dynamically as needed
        List<Arrival> arrivals1 = new ArrayList<>();
        arrivals1.add(arive);

        Payload payload = new Payload("source",arrivals1);
        payload.setSource("PPV");
        payload.setArrivals(arrivals);

        return payload;
    }


    public Payload getTrains(){



        return null;
    }
}
