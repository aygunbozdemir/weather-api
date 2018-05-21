# WeatherApi!

# What is it?
        This is a api to show weather status for any city name or coordinates and
        converting this response to entity and write to database (h2)
# Technologies
        This api writen with Spring Boot 2.0.0 version
        Lombok 1.16.20
        h2 db
- The weather information is obtained with [OpenWeatherMapApi](https://openweathermap.org/)
- And each query writing to database
# How to use?
  -You can create query By city name or city coordinates(x,y)
  - By city name  
 http://localhost:8080/weather/getWeather/getByCityName?cityName=cityName
  - By coordinates
  http://localhost:8080/weather/getWeather/getByCoordinates?lat=35&lon=139
  - Past query list
  http://localhost:8080/weather/getWeather/getWeatherList
Aygün Bozdemir - 2018
aygunbozdemir@gmail.com

