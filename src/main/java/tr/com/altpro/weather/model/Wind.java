package tr.com.altpro.weather.model;

import lombok.Data;


public class Wind {

    private double speed;
    private Integer deg;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public Wind() {
    }
}
