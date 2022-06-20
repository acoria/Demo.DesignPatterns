package creational.abstractFactory.books

import creational.abstractFactory.Genre

class TechnicalBook : IBook {
    override fun getGenre(): Genre {
        return Genre.TECHNICAL
    }

    override fun getNumberOfPages(): Int {
        return 200
    }
}