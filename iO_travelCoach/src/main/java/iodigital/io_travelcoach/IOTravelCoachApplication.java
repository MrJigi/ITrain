package iodigital.io_travelcoach;

import iodigital.io_travelcoach.controller.TrainController;
import iodigital.io_travelcoach.script.StationCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@RequestMapping("/api")
public class IOTravelCoachApplication {

    public static void main(String[] args) {
        SpringApplication.run(IOTravelCoachApplication.class, args);
    }

}
