package tr.com.altpro.weather.boundary;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.altpro.weather.controller.WeatherService;
import tr.com.altpro.weather.entity.WeatherResponse;

import javax.inject.Inject;

@RestController
@RequestMapping(value = "/weather/getWeather")
public class WeatherResource {

    @Inject
    WeatherService weatherService;

    @RequestMapping(value = "/getByCityName", method = RequestMethod.GET)
    public ResponseEntity<WeatherResponse> getWeatherByCityName(@RequestParam(value="cityName",required = true) String cityName) {
        if(cityName != null && !cityName.isEmpty()) {
            return weatherService.getWeatherByCityName(cityName);
        }
        return null;
    }
    // TODO getWeatherByLocaiton logic
}
