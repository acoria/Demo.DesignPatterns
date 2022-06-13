package creational.builder.builder

import creational.builder.model.Rain
import creational.builder.model.Sky
import creational.builder.model.Sun

class DaySkyBuilder : IDaySkyBuilder {
    var sun: Sun? = null
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

    override fun addSun(): ISkyBuilder {
        sun = Sun()
        return this
    }

    override fun build(): Sky {
        return if (_color.isEmpty()) {
            Sky(
                sun = sun,
                percentageCoveredByClouds = _percentageCoveredByClouds,
                rain = rain
            )
        } else {
            Sky(
                sun = sun,
                percentageCoveredByClouds = _percentageCoveredByClouds,
                rain = rain,
                color = _color
            )
        }
    }
}