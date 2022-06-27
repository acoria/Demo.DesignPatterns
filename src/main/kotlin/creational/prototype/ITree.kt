package creational.prototype

interface ITree : ICloneable<ITree> {
    val height: Int
    var levelOfLightRequired: String
    var litresOfWaterRequired: Int
    var soil: String
    fun itsYourBirthday()
}