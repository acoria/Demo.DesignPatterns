package creational.abstractFactory.audioBooks

import creational.abstractFactory.Genre

class TechnicalAudioBook : IAudioBook {
    override fun getGenre(): Genre {
        return Genre.TECHNICAL
    }

    override fun getLengthInMinutes(): Int {
        return 30
    }
}