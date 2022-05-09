package builderPattern.director

import builderPattern.builder.INightSkyBuilder
import builderPattern.builder.NightSkyBuilder
import builderPattern.model.Sky

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