package tr.com.altpro.weather.entity;

import lombok.Data;

@Data
public class Weather {

    private Integer id;
    private String main;
    private String Description;
    private String icon;
}
