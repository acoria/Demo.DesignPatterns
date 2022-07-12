package structural.iterator

class LevelChildrenProvider<T>(private val numberOfLevels: Int, private val childrenProvider: ChildrenProvider<T>) {
    private val levelOfElements = mutableMapOf<T, Int>()

    fun create(): ChildrenProvider<T> = {
        val children: List<T>
        val levelOfChildElement = getLevelOfElement(it) + 1
        if (levelOfChildElement < numberOfLevels) {
            children = childrenProvider(it).onEach { child -> this.levelOfElements[child] = levelOfChildElement }
        } else {
            children = listOf()
        }
        children
    }

    private fun getLevelOfElement(element: T): Int {
        return if (levelOfElements.isEmpty()) {
            0
        } else {
            levelOfElements[element] ?: throw Error("Technical: Element $element not found")
        }
    }

    fun reset() {
        levelOfElements.clear()
    }
}