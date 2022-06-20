package creational.abstractFactory.books

import creational.abstractFactory.Genre

interface IBook {
    fun getGenre(): Genre
    fun getNumberOfPages(): Int
}