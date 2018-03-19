package tr.com.altpro.weather.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherResponse {

    @JsonProperty("coord")
    private Coord coord;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("clouds")
    private Clouds clouds;

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("dt")
    private Long dt;

    @JsonProperty("sys")
    private Sys sys;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private Integer cod;


}
