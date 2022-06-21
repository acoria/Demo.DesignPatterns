package creational.factory.abstractFactory.audioBooks

import creational.factory.abstractFactory.Genre

class CrimeAudioBook : IAudioBook {
    override fun getGenre(): Genre {
        return Genre.CRIME
    }

    override fun getLengthInMinutes(): Int {
        return 246
    }
}