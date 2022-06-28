package other.lazyLoading

class Lazy<T : Any>(private val initializer: () -> T) {
    private lateinit var _instance: T
    val instance: T
        get() {
            if (!this::_instance.isInitialized) {
                _instance = initializer()
            }
            return _instance
        }
}

fun <T : Any> lazy(initializer: () -> T): Lazy<T> {
    return Lazy(initializer)
}
