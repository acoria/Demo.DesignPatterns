package creational.factory.abstractFactory

import creational.factory.abstractFactory.blogs.CrimeBlog
import creational.factory.abstractFactory.blogs.IBlog
import creational.factory.abstractFactory.books.CrimeBook
import creational.factory.abstractFactory.books.IBook
import creational.factory.abstractFactory.audioBooks.CrimeAudioBook
import creational.factory.abstractFactory.audioBooks.IAudioBook

class CrimeReadingMaterialFactory : IReadingMaterialFactory {
    override fun createBlog(): IBlog {
        return CrimeBlog()
    }

    override fun createBook(): IBook {
        return CrimeBook()
    }

    override fun createAudioBook(): IAudioBook {
        return CrimeAudioBook()
    }
}