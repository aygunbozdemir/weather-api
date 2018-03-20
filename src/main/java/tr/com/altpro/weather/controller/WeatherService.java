package tr.com.altpro.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tr.com.altpro.weather.entity.WeatherResponse;

import javax.inject.Inject;

@Service
public class WeatherService {

    @Inject
    private RestTemplate restTemplate;

    public ResponseEntity<WeatherResponse> getWeatherByCityName(String cityName) {
        WeatherResponse response = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid=2307c4fb0bedb1b9f1bcbbe8e91814d1&&units=metric", WeatherResponse.class);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public ResponseEntity<WeatherResponse> getWeatherByCoordinates(double lat,double lon) {
        WeatherResponse response = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=2307c4fb0bedb1b9f1bcbbe8e91814d1&&units=metric", WeatherResponse.class);
        return new ResponseEntity<>(response,HttpStatus.FOUND);
    }
}
