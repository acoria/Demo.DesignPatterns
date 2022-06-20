package creational.abstractFactory.blogs

import creational.abstractFactory.Genre

interface IBlog {
    fun getGenre(): Genre
    fun getEstimatedReadingTimeInMinutes(): Int
}