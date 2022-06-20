package creational.abstractFactory.audioBooks

import creational.abstractFactory.Genre

interface IAudioBook {
    fun getGenre(): Genre
    fun getLengthInMinutes(): Int
}