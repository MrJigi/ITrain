package iodigital.io_travelcoach.model.JacksonMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import iodigital.io_travelcoach.model.tripPlanner.FareLegs;
import iodigital.io_travelcoach.service.disruption.Station;

import java.io.IOException;

public class JsonParser {

    public static FareLegs parseJson(String jsonResponse) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode jsonNode = objectMapper.valueToTree(jsonResponse);
        String jsonString = objectMapper.writeValueAsString(jsonResponse);
        return objectMapper.readValue(jsonResponse, FareLegs.class);
    }
}
