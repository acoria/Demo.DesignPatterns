package creational.objectPool

class ObjectPool<T>(private val numberOfInstances: Int, private val initializer: () -> T) {

    private val acquired = mutableListOf<T>()
    private val released = mutableListOf<T>()

    fun acquired(): T {
        val instance = if (released.isNotEmpty()) {
            released.first()
        } else {
            createNew()
        }
        acquired.add(instance)
        return instance
    }

    fun release(instance: T) {
        acquired.remove(instance)
        released.add(instance)
    }

    private fun createNew(): T {
        if (acquired.size < numberOfInstances) {
            return initializer()
        } else {
            throw Exception("No more objects available")
        }
    }
}