package creational.abstractFactory

import creational.abstractFactory.blogs.IBlog
import creational.abstractFactory.books.IBook
import creational.abstractFactory.audioBooks.IAudioBook

interface IReadingMaterialFactory {
    fun createBlog(): IBlog
    fun createBook(): IBook
    fun createAudioBook(): IAudioBook
}