package creational.factory.abstractFactory

import creational.factory.abstractFactory.blogs.IBlog
import creational.factory.abstractFactory.blogs.TechnicalBlog
import creational.factory.abstractFactory.books.IBook
import creational.factory.abstractFactory.books.TechnicalBook
import creational.factory.abstractFactory.audioBooks.IAudioBook
import creational.factory.abstractFactory.audioBooks.TechnicalAudioBook

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