package creational.factory.factoryMethod

class LocalGovernmentOffice : GovernmentOffice() {
    override fun createStamp(): IStamp {
        return LocalStamp()
    }

    class LocalStamp() : IStamp {
        override fun get(): String {
            return "Local stamp"
        }

    }
}