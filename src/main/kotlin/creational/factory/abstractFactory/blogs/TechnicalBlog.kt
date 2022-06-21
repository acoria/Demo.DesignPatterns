package creational.factory.abstractFactory.blogs

import creational.factory.abstractFactory.Genre

class TechnicalBlog : IBlog {
    override fun getGenre(): Genre {
        return Genre.TECHNICAL
    }

    override fun getEstimatedReadingTimeInMinutes(): Int {
        return 95
    }
}