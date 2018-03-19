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
        WeatherResponse response = restTemplate.getForObject("http://samples.openweathermap.org/data/2.5/weather?q="+cityName+"&appid=b6907d289e10d714a6e88b30761fae22", WeatherResponse.class);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
}
