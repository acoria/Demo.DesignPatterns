package creational.objectPool

fun main() {
    val library = ObjectPool(3) { Book() }
    library.acquired()
    library.acquired()
    val book = library.acquired()
    library.release(book)
    library.acquired()
}