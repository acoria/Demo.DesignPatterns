package creational.factory.abstractFactory.books

import creational.factory.abstractFactory.Genre

class CrimeBook : IBook {
    override fun getGenre(): Genre {
        return Genre.CRIME
    }

    override fun getNumberOfPages(): Int {
        return 400
    }
}