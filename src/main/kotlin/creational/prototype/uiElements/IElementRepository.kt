package creational.prototype.uiElements

interface IElementRepository {
    fun <T : IElement> add(element: T)
    fun <T : IElement> find(name: String): T
}