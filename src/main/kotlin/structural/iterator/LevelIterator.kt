package structural.iterator

class LevelIterator<T>(rootNode: T, numberOfLevels: Int, childrenProvider: ChildrenProvider<T>) :
    IIterator<T> {
    private val levelChildrenProvider = LevelChildrenProvider<T>(numberOfLevels, childrenProvider)
    private val iterator: IIterator<T>

    init {
        iterator = GenericIterator(
            rootNode,
            levelChildrenProvider.create()
        ).apply {
            registerOnReset {
                levelChildrenProvider.reset()
            }
        }
    }

    override fun next(): T {
        return iterator.next()
    }

    override fun hasNext(): Boolean {
        return iterator.hasNext()
    }

    override fun reset() {
        iterator.reset()
    }

    override fun registerOnReset(callback: (IIterator<T>) -> Unit) {
        iterator.registerOnReset(callback)
    }

}