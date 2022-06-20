package creational.abstractFactory

import creational.abstractFactory.blogs.CrimeBlog
import creational.abstractFactory.blogs.IBlog
import creational.abstractFactory.books.CrimeBook
import creational.abstractFactory.books.IBook
import creational.abstractFactory.audioBooks.CrimeAudioBook
import creational.abstractFactory.audioBooks.IAudioBook

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