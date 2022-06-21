package creational.factory.factoryMethod

class NationwideGovernmentOffice : GovernmentOffice() {
    override fun createStamp(): IStamp {
        return LocalStamp()
    }

    class LocalStamp() : IStamp {
        override fun get(): String {
            return "Nationwide stamp"
        }

    }
}