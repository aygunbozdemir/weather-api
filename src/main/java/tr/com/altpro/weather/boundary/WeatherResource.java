package tr.com.altpro.weather.boundary;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.altpro.weather.control.WeatherService;
import tr.com.altpro.weather.entity.WeatherEntity;
import tr.com.altpro.weather.model.WeatherResponse;

import javax.inject.Inject;

@RestController
@RequestMapping(value = "/weather/getWeather")
public class WeatherResource {

    @Inject
    WeatherService weatherService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")//to enable give data to browsers
    @RequestMapping(value = "/getByCityName", method = RequestMethod.GET)
    public ResponseEntity<WeatherResponse> getWeatherByCityName(@RequestParam(value = "cityName", required = true) String cityName) {
        ResponseEntity<WeatherResponse> responseEntity = weatherService.getWeatherByCityName(cityName); // TODO : add exception handling to REstTemplate

        if (cityName != null && !cityName.isEmpty()) {
            return responseEntity;
        }
        return null;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @RequestMapping(value = "/getByCoordinates",method = RequestMethod.GET)
    public ResponseEntity<WeatherResponse> getWeatherByCoordinates(@RequestParam(value = "lat",required = true)Double lat,@RequestParam(value = "lon",required = true)Double lon) {
       ResponseEntity<WeatherResponse> responseEntity = weatherService.getWeatherByCoordinates(lat,lon);

        if (lat != null && lon!=null) {
            return responseEntity;
        }
        return null;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @RequestMapping(value = "/getWeatherList",method = RequestMethod.GET)
    public  ResponseEntity<Iterable<WeatherEntity>> getWeatherList() {
        ResponseEntity<Iterable<WeatherEntity>> weatherList = weatherService.getWeatherList();

        return weatherList;
    }
}
