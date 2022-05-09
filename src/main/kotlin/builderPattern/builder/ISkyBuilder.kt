package builderPattern.builder

import builderPattern.model.Sky

interface ISkyBuilder {
    fun addRain(): ISkyBuilder
    fun setColor(color: String): ISkyBuilder
    fun setPercentageCoveredByClouds(percentage: Int): ISkyBuilder
    fun build(): Sky
}