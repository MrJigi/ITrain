package iodigital.io_travelcoach.script;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Component
public class StationCode {

    public StationCode() {
        this.mainThing();
    }

    Map<String, String> stationMap = new HashMap<>();

    public Map<String, String> processStationCodes(String filePath) throws IOException {
//        Map<String, String> stationMap = new HashMap<>();
        String currentLetter = "";

        List<String> lines = Files.readAllLines(Paths.get(filePath));

        // Split the input into lines
//        String[] lines = input.split("\n");

        // Process each line
        for (String line : lines) {
            // Check if the line is a single letter
            if (line.length() == 1 && Character.isLetter(line.charAt(0))) {
                currentLetter = line;  // Update the current letter (e.g., A, B)
            } else {
                // Split the line into station code (key) and station name (value)
                String[] parts = line.split(" ", 2);  // Split into two parts: key (code) and value (name)
                if (parts.length == 2) {
                    String code = parts[0];  // The station code (e.g., "Ac", "Ahp")
                    String name = parts[1];  // The station name (e.g., "Abcoude", "Arnhem Velperpoort")

                    // Add the code-name pair to the map
                    stationMap.put(code, name);
                }
            }
        }

        return stationMap;
    }

    public String findStationCode(String name){
        for(Map.Entry<String,String> entry: stationMap.entrySet() ) {
            if (entry.getValue().equalsIgnoreCase(name)){
                return entry.getKey();
            }

        }
        System.out.println("Station code not found");
        return null;
    }
    public String mainThing() {

//        Change this section to have a path from the Projects root
        // Need to save the results in an object that it would be easier to process

//        StationCodeProcessor processor = new StationCodeProcessor();
        String filePath = "C:\\Users\\evaldas.drasutis\\iO\\iO_travelCoach\\src\\main\\java\\iodigital\\io_travelcoach\\textFiles\\station ID NS.txt";
//        Map<String, String> stationMap = processStationCodes(filePath);

        try {
            Map<String, String> stationMap = processStationCodes(filePath);
            for(Map.Entry<String,String> entry : stationMap.entrySet()){
                System.out.println("Code: " + entry.getKey() + ", Station:" + entry.getValue());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public Map<String,String> stationMapObj(){
        return stationMap;
    }

}
