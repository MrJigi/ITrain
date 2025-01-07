package iodigital.io_travelcoach.service;

import iodigital.io_travelcoach.config.TokenConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChargeService {

    private static final RestTemplate restTemplate = new RestTemplate();
//    @Value("${map.api.name}")
//    private String apiMapName;
//    @Value("${map.api.key}")
//    private String apiMapKey;


    private static TokenConfig tokenConfig;

    @Autowired
    public ChargeService(TokenConfig tokenConfig) {
        ChargeService.tokenConfig = tokenConfig;
    }


    public static String getSharingStations(double latitude, double longitude, int maxResults){
        String url = "https://api.openchargemap.io/v3/poi/?output=json&latitude="
                + latitude + "&longitude=" + longitude + "&maxresults=" + maxResults
                ;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set(tokenConfig.getEvApiname(),tokenConfig.getEvApikey());

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity, String.class );
//        System.out.println(response.getBody().toString());





        return response.getBody();
    }


//      public String getShargingStations(double latitude,double longitude, int maxResults){
//        String url = "https://api.openchargemap.io/v3/poi/?output=json&latitude="
//                + latitude + "&longitude=" + longitude + "&maxresults=" + maxResults
//                ;
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Accept", "application/json");
//        headers.set(apiMapName,apiTripKey);
//
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity, String.class );
//        System.out.println(response.getBody().toString());
//
//
//        return response.getBody();
//    }




}
