package creational.factory.abstractFactory.audioBooks

import creational.factory.abstractFactory.Genre

class SciFiAudioBook : IAudioBook {
    override fun getGenre(): Genre {
        return Genre.SCI_FI
    }

    override fun getLengthInMinutes(): Int {
        return 62
    }
}