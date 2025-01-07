package iodigital.io_travelcoach.model.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stops {
    @JsonProperty("stop_id")
    private String stop_id;
    @JsonProperty("stop_code")
    private String stop_code;
    @JsonProperty("stop_name")
    private String stop_name;
    @JsonProperty("stop_lat")
    private String  stop_lat;
    @JsonProperty("stop_lon")
    private String  stop_lon;
    @JsonProperty("zone_id")
    private String zone_id ;
    @JsonProperty("stop_url")
    private String stop_url;
    @JsonProperty("location_type")
    private String location_type;
    @JsonProperty("parent_station")
    private String parent_station;
    @JsonProperty("stop_desc")
    private String stop_desc ;
    @JsonProperty("stop_timezone")
    private String stop_timezone ;
    @JsonProperty("wheelchair_boarding")
    private String wheelchair_boarding;
    @JsonProperty("level_id")
    private String level_id ;
    @JsonProperty("platform_code")
    private String platform_code;

    public void setStop_id(String stop_id) {
        this.stop_id = stop_id;
    }

    public void setStop_code(String stop_code) {
        this.stop_code = stop_code;
    }

    public void setStop_name(String stop_name) {
        this.stop_name = stop_name;
    }

    public String setStop_lat(String stop_lat) {
      return  this.stop_lat = stop_lat;
    }

    public String setStop_lon(String stop_lon) {
        return this.stop_lon = stop_lon;
    }


    public void setZone_id(String zone_id) {
        this.zone_id = zone_id;
    }

    public void setStop_url(String stop_url) {
        this.stop_url = stop_url;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public void setParent_station(String parent_station) {
        this.parent_station = parent_station;
    }

    public void setStop_desc(String stop_desc) {
        this.stop_desc = stop_desc;
    }

    public void setStop_timezone(String stop_timezone) {
        this.stop_timezone = stop_timezone;
    }

    public void setWheelchair_boarding(String wheelchair_boarding) {
        this.wheelchair_boarding = wheelchair_boarding;
    }

    public void setLevel_id(String level_id) {
        this.level_id = level_id;
    }

    public void setPlatform_code(String platform_code) {
        this.platform_code = platform_code;
    }
}
