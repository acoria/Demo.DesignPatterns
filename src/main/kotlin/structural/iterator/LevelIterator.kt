package structural.iterator

class LevelIterator<T : IHaveChildren<T>>(root: T, private val numberOfLevels: Int) :
    IIterator<T> {
    private val genericIterator: IIterator<T>
    private val levelOfElements = mutableMapOf<T, Int>()
    private val childrenProvider: (T) -> List<T> = {
        val children: List<T>
        val levelOfElement = getLevelOfElement(it)
        if (levelOfElement < numberOfLevels) {
            val levelOfChild = levelOfElement + 1
            children = it.getChildren().onEach { child -> this.levelOfElements[child] = levelOfChild }
        } else {
            children = listOf()
        }
        children
    }

    init {
        genericIterator = GenericIterator(root, childrenProvider)
    }

    private fun getLevelOfElement(element: T): Int {
        return if (levelOfElements.isEmpty()) {
            0
        } else {
            levelOfElements[element] ?: throw Error("Technical: Element $element not found")
        }
    }

    override fun next(): T {
        return genericIterator.next()
    }

    override fun hasNext(): Boolean {
        return genericIterator.hasNext()
    }

    override fun reset() {
        levelOfElements.clear()
        genericIterator.reset()
    }
}