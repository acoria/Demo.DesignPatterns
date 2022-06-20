package creational.abstractFactory.audioBooks

import creational.abstractFactory.Genre

class CrimeAudioBook : IAudioBook {
    override fun getGenre(): Genre {
        return Genre.CRIME
    }

    override fun getLengthInMinutes(): Int {
        return 246
    }
}