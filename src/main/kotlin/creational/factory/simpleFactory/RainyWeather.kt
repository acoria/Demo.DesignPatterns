package creational.factory.simpleFactory

class RainyWeather : IWeather {
    override fun get(): String {
        return "Drizzle rain"
    }
}