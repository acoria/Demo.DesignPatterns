package creational.abstractFactory.blogs

import creational.abstractFactory.Genre

class SciFiBlog : IBlog {
    override fun getGenre(): Genre {
        return Genre.SCI_FI
    }

    override fun getEstimatedReadingTimeInMinutes(): Int {
        return 300
    }
}