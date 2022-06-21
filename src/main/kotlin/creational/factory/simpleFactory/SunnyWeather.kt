package creational.factory.simpleFactory

class SunnyWeather : IWeather {
    override fun get(): String {
        return "Beautifully sunny"
    }
}