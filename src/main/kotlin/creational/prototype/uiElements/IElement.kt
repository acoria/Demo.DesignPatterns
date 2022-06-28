package creational.prototype.uiElements

interface IElement : INameable, ICloneable {
    var width: Int
    var height: Int
    var color: String
}