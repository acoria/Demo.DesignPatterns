package creational.builder

import creational.builder.builder.DaySkyBuilder
import creational.builder.director.NightSkyDirector
import creational.builder.director.SolarEclipseDirector

fun main() {
    println(DaySkyBuilder().addSun().addRain().build().looksLike())
    println(NightSkyDirector().make().looksLike())
    println(SolarEclipseDirector(DaySkyBuilder()).make().looksLike())
}