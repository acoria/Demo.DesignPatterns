package creational.factory.simpleFactory

class WeatherFactory : IWeatherFactory {
    override fun createByWeatherType(weatherType: WeatherType): IWeather {
        return when (weatherType) {
            WeatherType.SUNNY -> SunnyWeather()
            WeatherType.CLOUDY -> CloudyWeather()
            WeatherType.RAINY -> RainyWeather()
        }
    }
}