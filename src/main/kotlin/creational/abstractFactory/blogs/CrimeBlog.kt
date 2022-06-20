package creational.abstractFactory.blogs

import creational.abstractFactory.Genre

class CrimeBlog : IBlog {
    override fun getGenre(): Genre {
        return Genre.CRIME
    }

    override fun getEstimatedReadingTimeInMinutes(): Int {
        return 120
    }
}