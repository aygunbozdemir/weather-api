package tr.com.altpro.weather.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.com.altpro.weather.entity.WeatherEntity;

@Repository
public interface WeatherRepository extends CrudRepository<WeatherEntity,Long> {


}
