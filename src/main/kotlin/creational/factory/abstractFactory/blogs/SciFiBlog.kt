package creational.factory.abstractFactory.blogs

import creational.factory.abstractFactory.Genre

class SciFiBlog : IBlog {
    override fun getGenre(): Genre {
        return Genre.SCI_FI
    }

    override fun getEstimatedReadingTimeInMinutes(): Int {
        return 300
    }
}