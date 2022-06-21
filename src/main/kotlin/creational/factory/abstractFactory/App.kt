package creational.factory.abstractFactory


/**
 * There is a product family of "reading material" (blogs, books, magazines)
 * There are also different genres (Crime, SciFi, Technical)
 */

class Publisher {

    lateinit var readingMaterialFactory: IReadingMaterialFactory

    fun announceGenreWeek(genre: Genre, readingMaterialFactory: IReadingMaterialFactory) {
        this.readingMaterialFactory = readingMaterialFactory
        println("It is $genre week!")
    }

    fun announcePublications() {
        publishBook()
        publishBlog()
        publishAudioBook()
    }

    private fun publishBook() {
        val book = readingMaterialFactory.createBook()
        println("The ${book.getGenre()} book is now out with ${book.getNumberOfPages()} pages of reading.")
    }

    private fun publishBlog() {
        val blog = readingMaterialFactory.createBlog()
        println("The newest ${blog.getGenre()} blog with an estimated ${blog.getEstimatedReadingTimeInMinutes()} minutes of reading time.")
    }

    private fun publishAudioBook() {
        val audioBook = readingMaterialFactory.createAudioBook()
        println("The new ${audioBook.getGenre()} audio book is out and ready for your ${audioBook.getLengthInMinutes()} minute listen.")
    }
}

fun main() {
    // Think of a publisher, offering Genre weeks: "This week is crime week"
    // and everything that goes out is crime related, no matter if book, blog or magazin.
    // On the other hand does not matter what type it is. Every type is published the same way.

    val publisher = Publisher()
    publisher.announceGenreWeek(Genre.TECHNICAL, TechnicalReadingMaterialFactory())
    publisher.announcePublications()

    publisher.announceGenreWeek(Genre.CRIME, CrimeReadingMaterialFactory())
    publisher.announcePublications()
}