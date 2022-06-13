package creational.builder.builder

import creational.builder.model.Moon
import creational.builder.model.Rain
import creational.builder.model.Sky

class NightSkyBuilder : INightSkyBuilder {
    private var moon: Moon? = null
    private var _numberOfStars: Long = 0
    private var rain: Rain? = null
    private var _color: String = ""
    private var _percentageCoveredByClouds: Int = 0

    override fun addRain(): ISkyBuilder {
        rain = Rain()
        return this
    }

    override fun setColor(color: String): ISkyBuilder {
        _color = color
        return this
    }

    override fun setPercentageCoveredByClouds(percentage: Int): ISkyBuilder {
        _percentageCoveredByClouds = percentage
        return this
    }

    override fun build(): Sky {
        return if (_color.isEmpty()) {
            Sky(
                moon = moon,
                numberOfStars = _numberOfStars,
                percentageCoveredByClouds = _percentageCoveredByClouds,
                rain = rain
            )
        } else {
            Sky(
                moon = moon,
                numberOfStars = _numberOfStars,
                percentageCoveredByClouds = _percentageCoveredByClouds,
                rain = rain,
                color = _color
            )
        }
    }

    override fun addMoon(): ISkyBuilder {
        moon = Moon()
        return this
    }

    override fun setNumberOfStars(number: Long): ISkyBuilder {
        _numberOfStars = number
        return this
    }
}