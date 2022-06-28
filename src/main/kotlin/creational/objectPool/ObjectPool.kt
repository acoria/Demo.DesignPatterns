package creational.objectPool

class ObjectPool<T>(private val numberOfInstances: Int, private val initializer: () -> T) {

    private val checkedOut = mutableListOf<T>()
    private val checkedIn = mutableListOf<T>()

    fun checkOut(): T {
        val instance = if (checkedIn.isNotEmpty()) {
            checkedIn.first()
        } else {
            createNew()
        }
        checkedOut.add(instance)
        return instance
    }

    fun checkIn(instance: T) {
        checkedOut.remove(instance)
        checkedIn.add(instance)
    }

    private fun createNew(): T {
        if (checkedOut.size < numberOfInstances) {
            return initializer()
        } else {
            throw Exception("No more objects available")
        }
    }
}