package creational.builder.director

import creational.builder.builder.INightSkyBuilder
import creational.builder.builder.NightSkyBuilder
import creational.builder.model.Sky

class NightSkyDirector(private val nightSkyBuilder: INightSkyBuilder = NightSkyBuilder()) : IDirector {
    override fun make(): Sky {
        return nightSkyBuilder.apply {
            addMoon()
            setNumberOfStars(145678987654)
            addRain()
            setColor("dark blue")
            setPercentageCoveredByClouds(20)
        }.build()
    }
}