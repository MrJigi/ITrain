package iodigital.io_travelcoach.model.disturbance;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Disturbance_request {

    private int id;
    private String type;
    private String title;
    private String start;
    private String end;
    private String reason;
    private List<String> locations;
    private String routes;
    private Boolean isMajor;
    private String advice;
    private List<publicationSections> publicationSections;

}
@AllArgsConstructor
@NoArgsConstructor
class publicationSections {
    private List<String> stations;
    private String track;
}