package creational.factory.abstractFactory.blogs

import creational.factory.abstractFactory.Genre

interface IBlog {
    fun getGenre(): Genre
    fun getEstimatedReadingTimeInMinutes(): Int
}