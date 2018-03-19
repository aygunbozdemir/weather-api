package tr.com.altpro.weather.entity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class WeatherException extends RuntimeException{

    public WeatherException(String message) {
        super(message);
    }
}
