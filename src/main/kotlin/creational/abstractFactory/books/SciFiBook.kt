package creational.abstractFactory.books

import creational.abstractFactory.Genre

class SciFiBook : IBook{
    override fun getGenre(): Genre {
        return Genre.SCI_FI
    }

    override fun getNumberOfPages(): Int {
        return 300
    }
}