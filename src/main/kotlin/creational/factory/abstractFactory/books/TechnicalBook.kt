package creational.factory.abstractFactory.books

import creational.factory.abstractFactory.Genre

class TechnicalBook : IBook {
    override fun getGenre(): Genre {
        return Genre.TECHNICAL
    }

    override fun getNumberOfPages(): Int {
        return 200
    }
}