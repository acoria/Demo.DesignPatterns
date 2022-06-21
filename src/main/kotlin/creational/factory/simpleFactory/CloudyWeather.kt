package creational.factory.simpleFactory

class CloudyWeather : IWeather {
    override fun get(): String {
        return "Grey"
    }
}