package tr.com.altpro.weather.entity;

import lombok.Data;

@Data
public class Main {

    private double temp;
    private Integer pressure;
    private Integer humidity;
    private double minTemp;
    private double maxTemp;
}
