package creational.factory.abstractFactory

import creational.factory.abstractFactory.blogs.IBlog
import creational.factory.abstractFactory.books.IBook
import creational.factory.abstractFactory.audioBooks.IAudioBook

interface IReadingMaterialFactory {
    fun createBlog(): IBlog
    fun createBook(): IBook
    fun createAudioBook(): IAudioBook
}