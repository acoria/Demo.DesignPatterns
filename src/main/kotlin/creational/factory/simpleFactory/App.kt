package creational.factory.simpleFactory

fun main() {
    println("And today's weather is: ${WeatherFactory().createByWeatherType(WeatherType.SUNNY).get()}")
}