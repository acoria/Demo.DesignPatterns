package creational.factory.abstractFactory

import creational.factory.abstractFactory.blogs.IBlog
import creational.factory.abstractFactory.blogs.SciFiBlog
import creational.factory.abstractFactory.books.IBook
import creational.factory.abstractFactory.books.SciFiBook
import creational.factory.abstractFactory.audioBooks.IAudioBook
import creational.factory.abstractFactory.audioBooks.SciFiAudioBook

class SciFiReadingMaterialFactory : IReadingMaterialFactory {
    override fun createBlog(): IBlog {
        return SciFiBlog()
    }

    override fun createBook(): IBook {
        return SciFiBook()
    }

    override fun createAudioBook(): IAudioBook {
        return SciFiAudioBook()
    }
}