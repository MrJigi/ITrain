package iodigital.io_travelcoach.dto.Response.Disruption;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DisruptionResponse {

    @JsonProperty("title")
    private String title;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("affectedStations")
    private List<StationInformation> affectedStations;
    @JsonProperty("consequenceDescription")
    private String consequenceDescription;
    @JsonProperty("consequenceLevel")
    private String consequenceLevel;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<StationInformation> getAffectedStations() {
        return affectedStations;
    }

    public void setAffectedStations(List<StationInformation> affectedStations) {
        this.affectedStations = affectedStations;
    }

    public String getConsequenceDescription() {
        return consequenceDescription;
    }

    public void setConsequenceDescription(String consequenceDescription) {
        this.consequenceDescription = consequenceDescription;
    }

    public String getConsequenceLevel() {
        return consequenceLevel;
    }

    public void setConsequenceLevel(String consequenceLevel) {
        this.consequenceLevel = consequenceLevel;
    }
}


