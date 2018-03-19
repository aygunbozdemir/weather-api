package tr.com.altpro.weather.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Main {

    private double temp;
    private Integer pressure;
    private Integer humidity;
    @JsonProperty("temp_min")
    private double minTemp;
    @JsonProperty("temp_max")
    private double maxTemp;
}
