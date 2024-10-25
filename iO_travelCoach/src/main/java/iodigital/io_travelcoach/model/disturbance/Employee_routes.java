package iodigital.io_travelcoach.model.disturbance;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Employee_routes {

    @Id
    private Integer id;
    private String employee_id;
    private String start_station;
    private String end_station;
    @ElementCollection
    private List<String> intermediate_stations;
    private LocalTime departure_time;
    private LocalTime arrival_time;




}
