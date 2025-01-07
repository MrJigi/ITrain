package iodigital.io_travelcoach.service;

import iodigital.io_travelcoach.config.TokenConfig;
import iodigital.io_travelcoach.model.TripResponse;
import iodigital.io_travelcoach.model.tripPlanner.NSTripLayout;
import iodigital.io_travelcoach.script.StationCode;
import iodigital.io_travelcoach.security.NsAccess;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor

@Service
@Getter
@Setter
public class TravelService {

    private final RestTemplate restTemplate;
    private final NsAccess nsAccess;
    public final TokenConfig tokenConfig;
    public final StationCode stationCode ;



//  === @GetMapping("/getTripFromTo")===
    public TripResponse getInfoForTrip (String startStation, String endStation) {
        String originStation = stationCode.findStationCode(startStation);
        String finalStation = stationCode.findStationCode(endStation);

        String url = nsAccess.getReisInformatieFromToStation(originStation,finalStation);
        // Set up headers with the subscription key
        HttpHeaders headers = new HttpHeaders();
        System.out.println(tokenConfig.getNsApiName());
        System.out.println(tokenConfig.getNsReisApiKey());

        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsReisApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<TripResponse> trip = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                TripResponse.class
        );
        return trip.getBody();
    }

    public ResponseEntity<String> getNearestStation(Double lat, Double lng, Integer amount){
        Double latitude = lat;
        Double longitude = lng;
        Integer limit = amount;

        String url = "https://gateway.apiportal.ns.nl/nsapp-stations/v3/nearest?lat="+latitude+"&lng="+longitude+"&limit="+limit+" ";
        // Set up headers with the subscription key
        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsTripApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
    }

    public ResponseEntity<NSTripLayout> getNsStations (String station ) {

        String stationNr = stationCode.findStationCode(station);
        String url = "https://gateway.apiportal.ns.nl/reisinformatie-api/api/v2/departures?station="+stationNr+" ";
        // Set up headers with the subscription key
        HttpHeaders headers = new HttpHeaders();
        headers.set(tokenConfig.getNsApiName(), tokenConfig.getNsPriceApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET,entity, NSTripLayout.class);

    }



}
