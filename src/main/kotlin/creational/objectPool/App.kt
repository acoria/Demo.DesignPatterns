package creational.objectPool

fun main() {
    val library = ObjectPool(3) { Book() }
    library.checkOut()
    library.checkOut()
    val book = library.checkOut()
    library.checkIn(book)
    library.checkOut()
}