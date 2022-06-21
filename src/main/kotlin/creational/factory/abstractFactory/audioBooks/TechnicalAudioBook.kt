package creational.factory.abstractFactory.audioBooks

import creational.factory.abstractFactory.Genre

class TechnicalAudioBook : IAudioBook {
    override fun getGenre(): Genre {
        return Genre.TECHNICAL
    }

    override fun getLengthInMinutes(): Int {
        return 30
    }
}