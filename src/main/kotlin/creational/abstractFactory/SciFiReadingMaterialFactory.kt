package creational.abstractFactory

import creational.abstractFactory.blogs.IBlog
import creational.abstractFactory.blogs.SciFiBlog
import creational.abstractFactory.books.IBook
import creational.abstractFactory.books.SciFiBook
import creational.abstractFactory.audioBooks.IAudioBook
import creational.abstractFactory.audioBooks.SciFiAudioBook

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