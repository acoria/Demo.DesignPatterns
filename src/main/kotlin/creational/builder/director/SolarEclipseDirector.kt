package creational.builder.director

import creational.builder.builder.ISkyBuilder
import creational.builder.model.Sky

class SolarEclipseDirector(private val skyBuilder: ISkyBuilder) : IDirector {
    override fun make(): Sky {
        return skyBuilder.apply {
            setColor("black")
            setPercentageCoveredByClouds(10)
        }.build()
    }
}