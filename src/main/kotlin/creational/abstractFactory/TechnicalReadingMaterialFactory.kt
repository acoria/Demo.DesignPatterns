package creational.abstractFactory

import creational.abstractFactory.blogs.IBlog
import creational.abstractFactory.blogs.TechnicalBlog
import creational.abstractFactory.books.IBook
import creational.abstractFactory.books.TechnicalBook
import creational.abstractFactory.audioBooks.IAudioBook
import creational.abstractFactory.audioBooks.TechnicalAudioBook

class TechnicalReadingMaterialFactory : IReadingMaterialFactory {
    override fun createBlog(): IBlog {
        return TechnicalBlog()
    }

    override fun createBook(): IBook {
        return TechnicalBook()
    }

    override fun createAudioBook(): IAudioBook {
        return TechnicalAudioBook()
    }
}