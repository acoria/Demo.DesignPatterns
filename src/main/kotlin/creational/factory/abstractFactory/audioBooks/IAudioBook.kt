package creational.factory.abstractFactory.audioBooks

import creational.factory.abstractFactory.Genre

interface IAudioBook {
    fun getGenre(): Genre
    fun getLengthInMinutes(): Int
}