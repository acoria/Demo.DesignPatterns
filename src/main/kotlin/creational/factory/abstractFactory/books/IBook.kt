package creational.factory.abstractFactory.books

import creational.factory.abstractFactory.Genre

interface IBook {
    fun getGenre(): Genre
    fun getNumberOfPages(): Int
}