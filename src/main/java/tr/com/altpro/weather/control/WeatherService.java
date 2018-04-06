package tr.com.altpro.weather.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tr.com.altpro.weather.entity.WeatherEntity;
import tr.com.altpro.weather.model.WeatherResponse;
import tr.com.altpro.weather.repository.WeatherRepository;

import javax.inject.Inject;

@Service
public class WeatherService {

    @Inject
    private RestTemplate restTemplate;

    @Inject
    WeatherRepository weatherRepository;


    public ResponseEntity<WeatherResponse> getWeatherByCityName(String cityName) {
        WeatherResponse response = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=2307c4fb0bedb1b9f1bcbbe8e91814d1&&units=metric", WeatherResponse.class);
        WeatherEntity weatherEntity = convert(response);
        weatherRepository.save(weatherEntity);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public ResponseEntity<WeatherResponse> getWeatherByCoordinates(double lat, double lon) {
        WeatherResponse response = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=2307c4fb0bedb1b9f1bcbbe8e91814d1&&units=metric", WeatherResponse.class);
        WeatherEntity weatherEntity = convert(response);
        weatherRepository.save(weatherEntity);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public ResponseEntity<Iterable<WeatherEntity>> getWeatherList() {
        Iterable<WeatherEntity> weatherList = weatherRepository.findAll();
        return new ResponseEntity<>(weatherList, HttpStatus.FOUND);
    }

    private WeatherEntity convert(WeatherResponse weatherResponse) {

        WeatherEntity weatherEntity = new WeatherEntity();
        weatherEntity.setId(weatherResponse.getId());
        weatherEntity.setCountry(weatherResponse.getSys().getCountry());
        weatherEntity.setName(weatherResponse.getName());
        weatherEntity.setStatus(weatherResponse.getWeather().get(0).getDescription());
        weatherEntity.setTemp(weatherResponse.getMain().getTemp());
        weatherEntity.setWindSpeed(weatherResponse.getWind().getSpeed());
        return weatherEntity;
    }
}
