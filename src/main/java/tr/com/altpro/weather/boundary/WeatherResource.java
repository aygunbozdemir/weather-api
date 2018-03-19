package tr.com.altpro.weather.boundary;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.altpro.weather.controller.WeatherService;
import tr.com.altpro.weather.entity.WeatherException;
import tr.com.altpro.weather.entity.WeatherResponse;

import javax.inject.Inject;

@RestController
@RequestMapping(value = "/weather/getWeather")
public class WeatherResource {

    @Inject
    WeatherService weatherService;

    @RequestMapping(value = "/getByCityName", method = RequestMethod.GET)
    public ResponseEntity<WeatherResponse> getWeatherByCityName(@RequestParam(value="cityName",required = true) String cityName) {
        ResponseEntity<WeatherResponse> responseEntity = weatherService.getWeatherByCityName(cityName); // TODO : add exception handling to REstTemplate
        if(responseEntity.equals(HttpStatus.NOT_FOUND)) {
            throw new WeatherException("City not found");
        }
        else if(cityName != null && !cityName.isEmpty()) {
            return weatherService.getWeatherByCityName(cityName);
        }
        else {
            throw new WeatherException("City name parameter should not be null");
        }
    }
    // TODO getWeatherByLocaiton logic
}
