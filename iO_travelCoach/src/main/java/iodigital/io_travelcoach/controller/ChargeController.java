package iodigital.io_travelcoach.controller;

import iodigital.io_travelcoach.service.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/charging-stations")
public class ChargeController {

    @Autowired
    public ChargeController(ChargeService chargeService){
    }



    @GetMapping("/getCharge")
    public ResponseEntity<String> getStations(@RequestParam double latitude, @RequestParam double longitude) {
        String response = ChargeService.getSharingStations(latitude,longitude,100);
        return ResponseEntity.ok(response);
    }

}
