package structural.iterator

typealias ChildrenProvider<T> = (T) -> List<T>

class GenericIterator<T>(private val root: T, private val childrenProvider: ChildrenProvider<T>) : IIterator<T> {
    private val stack = mutableListOf<T>()
    private val resetEventHandler = mutableListOf<(IIterator<T>) -> Unit>()

    init {
        initializeStack()
    }

    private fun initializeStack() {
        stack.clear()
        stack.add(root)
    }

    override fun next(): T {
        val next = stack.first()
        stack.remove(next)
        refillStack(next)
        return next
    }

    private fun refillStack(next: T) {
        val children = childrenProvider(next)
        if (children.isNotEmpty()) {
            stack.addAll(0, children)
        }
    }

    override fun hasNext(): Boolean {
        return stack.isNotEmpty()
    }

    override fun reset() {
        initializeStack()
        resetEventHandler.forEach { it(this) }
    }

    override fun registerOnReset(eventHandler: (IIterator<T>) -> Unit) {
        resetEventHandler.add(eventHandler)
    }
}