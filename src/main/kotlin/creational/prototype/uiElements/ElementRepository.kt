package creational.prototype.uiElements

class ElementRepository : IElementRepository {
    private val elements = mutableMapOf<String, IElement>()
    override fun <T : IElement> add(element: T) {
        elements.put(element.name, element)
    }

    override fun <T : IElement> find(name: String): T {
        return elements[name] as T
    }

}