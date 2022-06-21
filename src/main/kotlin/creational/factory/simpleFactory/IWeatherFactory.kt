package creational.factory.simpleFactory

interface IWeatherFactory {
    fun createByWeatherType(weatherType: WeatherType): IWeather
}