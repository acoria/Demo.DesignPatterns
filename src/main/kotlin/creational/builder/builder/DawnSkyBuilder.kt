package creational.builder.builder

import creational.builder.model.Sky

class DawnSkyBuilder: IDawnSkyBuilder {
    override fun addRain(): ISkyBuilder {
        TODO("Not yet implemented")
    }

    override fun setColor(color: String): ISkyBuilder {
        TODO("Not yet implemented")
    }

    override fun setPercentageCoveredByClouds(percentage: Int): ISkyBuilder {
        TODO("Not yet implemented")
    }

    override fun build(): Sky {
        TODO("Not yet implemented")
    }

    override fun addSun(): ISkyBuilder {
        TODO("Not yet implemented")
    }

    override fun addMoon(): ISkyBuilder {
        TODO("Not yet implemented")
    }

    override fun setNumberOfStars(number: Long): ISkyBuilder {
        TODO("Not yet implemented")
    }
}