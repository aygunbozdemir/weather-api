package tr.com.altpro.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public class Main {

    private double temp;
    private Integer pressure;
    private Integer humidity;
    @JsonProperty("temp_min")
    private double minTemp;
    @JsonProperty("temp_max")
    private double maxTemp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Main() {
    }
}
