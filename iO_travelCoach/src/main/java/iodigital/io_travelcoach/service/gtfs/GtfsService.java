package iodigital.io_travelcoach.service.gtfs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import iodigital.io_travelcoach.model.POJO.*;
import iodigital.io_travelcoach.script.CSVReader;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
public class GtfsService {

    private final String outputDir = "/source/improved/improved-gtfs-gtfs-nl";
    public String stopPath =
            "C:\\Users\\evaldas.drasutis\\iO\\iO_travelCoach\\src\\main\\java\\iodigital\\io_travelcoach\\textFiles\\improved-gtfs-gtfs-nl\\stops.txt";

    public String routesPath =
            "C:\\Users\\evaldas.drasutis\\iO\\iO_travelCoach\\src\\main\\java\\iodigital\\io_travelcoach\\textFiles\\improved-gtfs-gtfs-nl\\routes.txt";

    public String tripsPath =
            "C:\\Users\\evaldas.drasutis\\iO\\iO_travelCoach\\src\\main\\java\\iodigital\\io_travelcoach\\textFiles\\improved-gtfs-gtfs-nl\\trips.txt";

    public String shapePath =
            "C:\\Users\\evaldas.drasutis\\iO\\iO_travelCoach\\src\\main\\java\\iodigital\\io_travelcoach\\textFiles\\improved-gtfs-gtfs-nl\\shapes.txt";

    public String stopTimesPath =
            "C:\\Users\\evaldas.drasutis\\iO\\iO_travelCoach\\src\\main\\java\\iodigital\\io_travelcoach\\textFiles\\improved-gtfs-gtfs-nl\\stop_times.txt";


    public void unzipGTFS(String path) throws IOException {
        byte[] buffer = new byte[1024];
        ZipInputStream zis = new ZipInputStream(new FileInputStream(path));
        ZipEntry ze = zis.getNextEntry();

        while (ze != null) {
            File newFile = new File(path + File.separator + ze.getName());

            if (ze.isDirectory()) {
                newFile.mkdirs();
            } else {
                new File(newFile.getParent()).mkdirs();
                try {
                    FileOutputStream fos = new FileOutputStream(newFile);
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                    throw new IOException("Failed to unzip GTFS file");
                }
            }
            ze = zis.getNextEntry();
        }
        zis.closeEntry();
        zis.close();
    }


//    public List<Stops> parseStops (File csvFile) throws IOException {
//
//        CsvMapper csvMapper = new CsvMapper();
//        CsvSchema schema = CsvSchema.emptySchema().withHeader(); //Could add a separator letter
//
//        try (MappingIterator<Stops> it = csvMapper.readerFor(Stops.class).with(schema).readValues(csvFile)) {
//            return it.readAll();
//        }
//       catch (IOException e) {
//            throw new IOException("Failed to parse CSV file", e);
//        }
//
//    }











//Stops
//    public List<Stops> parseStops(File csvFile) throws IOException {
//        List<Stops> stopsList = new ArrayList<>();
//
//        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            String line;
//            String[] headers = null;
//
//            while ((line = br.readLine()) != null) {
//                //First line is the header
//                if (headers == null){
//                    headers = line.split(",");
//                    continue;
//                }
//
//                //Split the data line by commas
//                String[] values = line.split(",");
//
//                // Create a new Stops object and manually map values
//                Stops stop = new Stops();
//
//                for(int i = 0; i< values.length; i++){
//                    String header = headers[i].trim();
//                    String value = values[i].trim();
//
//                    switch (header){
//                        case "stop_id":
//                            stop.setStop_id(value);
//                            break;
//                        case "stop_name":
//                            stop.setStop_name(value);
//                            break;
//                        case "stop_lat":
//                            stop.setStop_lat(value); // Handle nulls
//                            break;
//                        case "stop_lon":
//                            stop.setStop_lon(value); // Handle nulls
//                            break;
//                        case "platform_code":
//                            stop.setPlatform_code(value);
//                            break;
//                        default:
//                            // Handle unknown headers or log
//                            break;
//
//                    }
//                }
//                stopsList.add(stop);
//
//            }
//        }
//        catch (IOException e){
//            throw new IOException("Failed to parse CSV file", e);
//        }
//        return stopsList;
//    }

//    public List<Stops> processGTFS() throws IOException {
//        File stopsFile = new File(filePath );
//        if (!stopsFile.exists()) {
//            throw new FileNotFoundException("File not found: " + stopsFile);
//        }
//        CSVReader<Stops> csvReader = new CSVReader<Stops>(Stops.class);
//        List<Stops> stops = csvReader.readCSV(stopsFile);
//
//        // Do something with the stops data (e.g., saving to a database or returning in an API)
//        try {
//            for (Stops stop : stops) {
//
//                System.out.println("Stop: " + stop.getStop_name() + " (" + stop.getStop_lat() + ", " + stop.getStop_lon() + ")");
//            }
//            return stops;
//
//        }
//        catch (Exception e) {
//            System.out.println("Encountered error with GTFS - "+e.fillInStackTrace().toString());
//        }
//        return stops;
//    }
//
    public List<Stops> processCsvFile() throws IOException {
    File csvFile = new File(stopPath); // Specify the path to your CSV file
    if (!csvFile.exists()) {
        throw new IOException("File not found: " + stopPath);
    }

    return parseStops(csvFile); // Call your parse method
}

    public List<Routes> processRoutes() throws IOException {
        File csvFile = new File(routesPath); // Specify the path to your CSV file
        if (!csvFile.exists()) {
            throw new IOException("File not found: " + routesPath);
        }

        return parseRoutes(csvFile); // Call your parse method
    }

    public List<Trips> processTrips() throws IOException {
        File csvFile = new File(tripsPath); // Specify the path to your CSV file
        if (!csvFile.exists()) {
            throw new IOException("File not found: " + tripsPath);
        }

        return parseTrips(csvFile); // Call your parse method
    }

    public List<Shapes> processShapes() throws IOException {
        File csvFile = new File(shapePath); // Specify the path to your CSV file
        if (!csvFile.exists()) {
            throw new IOException("File not found: " + shapePath);
        }

        return parseShape(csvFile); // Call your parse method
    }

    public List<Stop_times> processStopTimes() throws IOException {
        File csvFile = new File(stopTimesPath); // Specify the path to your CSV file
        if (!csvFile.exists()) {
            throw new IOException("File not found: " + stopTimesPath);
        }

        return parseStopTimes(csvFile); // Call your parse method
    }


//Converters =========

    public void CsvToJson(List<Object> stopsList, String outputPath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File outputFile = new File(outputPath);
        objectMapper.writeValue(outputFile, stopsList);
    }


    public List<Stops> readJsonFromFile(String jsonFilePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Stops>>() {});
    }

    //Converters -=============

    public List<Stops> parseStops(File csvFile) throws IOException {
        try {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.builder()
                    .addColumn("stop_id")
                    .addColumn("stop_code")
                    .addColumn("stop_name")
                    .addColumn("stop_lat")
                    .addColumn("stop_lon")
                    .addColumn("zone_id")
                    .addColumn("stop_url")
                    .addColumn("location_type")
                    .addColumn("parent_station")
                    .addColumn("stop_desc")
                    .addColumn("stop_timezone")
                    .addColumn("wheelchair_boarding")
                    .addColumn("level_id")
                    .addColumn("platform_code")
                    .build().withHeader().withColumnSeparator(','); // Add specific separator

            MappingIterator<Stops> stopsIterator = csvMapper.readerFor(Stops.class)
                    .with(schema)
                    .readValues(csvFile);

            return stopsIterator.readAll();
        } catch (IOException e) {
            throw new IOException("Failed to parse CSV file", e);
        }
    }



    public List<Routes> parseRoutes(File csvFile) throws IOException {
        try {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.builder()
                    .addColumn("route_id")
                    .addColumn("agency_id")
                    .addColumn("route_short_name")
                    .addColumn("route_long_name")
                    .addColumn("route_desc")
                    .addColumn("route_type")
                    .addColumn("route_url")
                    .addColumn("route_color")
                    .addColumn("route_text_color")
                    .addColumn("route_sort_order")
                    .addColumn("continuous_pickup")
                    .addColumn("continuous_drop_off")
                    .build().withHeader().withColumnSeparator(','); // Add specific separator

            MappingIterator<Routes> stopsIterator = csvMapper.readerFor(Routes.class)
                    .with(schema)
                    .readValues(csvFile);

            return stopsIterator.readAll();
        } catch (IOException e) {
            throw new IOException("Failed to parse CSV file", e);
        }
    }

    public List<Trips> parseTrips(File csvFile) throws IOException {
        try {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.builder()
                    .addColumn("route_id")
                    .addColumn("service_id")
                    .addColumn("trip_id")
                    .addColumn("trip_headsign")
                    .addColumn("trip_short_name")
                    .addColumn("direction_id")
                    .addColumn("block_id")
                    .addColumn("shape_id")
                    .addColumn("wheelchair_accessible")
                    .addColumn("bikes_allowed")

                    .build().withHeader().withColumnSeparator(','); // Add specific separator

            MappingIterator<Trips> stopsIterator = csvMapper.readerFor(Trips.class)
                    .with(schema)
                    .readValues(csvFile);

            return stopsIterator.readAll();
        } catch (IOException e) {
            throw new IOException("Failed to parse CSV file", e);
        }
    }

    public List<Stop_times> parseStopTimes(File csvFile) throws IOException {
        try {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.builder()
                    .addColumn("trip_id")
                    .addColumn("arrival_time")
                    .addColumn("departure_time")
                    .addColumn("stop_id")
                    .addColumn("stop_sequence")
                    .addColumn("stop_headsign")
                    .addColumn("pickup_type")
                    .addColumn("drop_off_type")
                    .addColumn("continuous_pickup")
                    .addColumn("continuous_drop_off")
                    .addColumn("shape_dist_travel")
                    .addColumn("timepoint")
                    .build().withHeader().withColumnSeparator(','); // Add specific separator

            MappingIterator<Stop_times> stopsIterator = csvMapper.readerFor(Stop_times.class)
                    .with(schema)
                    .readValues(csvFile);

            return stopsIterator.readAll();
        } catch (IOException e) {
            throw new IOException("Failed to parse CSV file", e);
        }
    }

    public List<Shapes> parseShape(File csvFile) throws IOException {
        try {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.builder()
                    .addColumn("shape_id")
                    .addColumn("shape_pt_lat")
                    .addColumn("shape_pt_lon")
                    .addColumn("shape_pt_sequence")
                    .addColumn("shape_dist_traveled")

                    .build().withHeader().withColumnSeparator(','); // Add specific separator

            MappingIterator<Shapes> stopsIterator = csvMapper.readerFor(Shapes.class)
                    .with(schema)
                    .readValues(csvFile);

            return stopsIterator.readAll();
        } catch (IOException e) {
            throw new IOException("Failed to parse CSV file", e);
        }
    }


//    end of conversion ===============================================
    private Double parseDouble(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null; // Handle invalid number format
        }
    }


}
