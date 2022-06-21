package creational.factory.factoryMethod

class OfficialDocument(val name: String = "Passport") {
    lateinit var stamp: IStamp
    fun addStamp(stamp: IStamp) {
        this.stamp = stamp
    }
}