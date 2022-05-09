package builderPattern

import builderPattern.builder.DaySkyBuilder
import builderPattern.director.NightSkyDirector
import builderPattern.director.SolarEclipseDirector

fun main() {
    println(DaySkyBuilder().addSun().addRain().build().looksLike())
    println(NightSkyDirector().make().looksLike())
    println(SolarEclipseDirector(DaySkyBuilder()).make().looksLike())
}