package creational.factory.abstractFactory.blogs

import creational.factory.abstractFactory.Genre

class CrimeBlog : IBlog {
    override fun getGenre(): Genre {
        return Genre.CRIME
    }

    override fun getEstimatedReadingTimeInMinutes(): Int {
        return 120
    }
}