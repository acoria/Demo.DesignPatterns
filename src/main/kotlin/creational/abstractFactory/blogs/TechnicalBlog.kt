package creational.abstractFactory.blogs

import creational.abstractFactory.Genre

class TechnicalBlog : IBlog {
    override fun getGenre(): Genre {
        return Genre.TECHNICAL
    }

    override fun getEstimatedReadingTimeInMinutes(): Int {
        return 95
    }
}