package builderPattern.director

import builderPattern.builder.ISkyBuilder
import builderPattern.model.Sky

class SolarEclipseDirector(private val skyBuilder: ISkyBuilder) : IDirector {
    override fun make(): Sky {
        return skyBuilder.apply {
            setColor("black")
            setPercentageCoveredByClouds(10)
        }.build()
    }
}