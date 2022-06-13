package creational.builder.builder

interface INightSkyBuilder : ISkyBuilder {
    fun addMoon(): ISkyBuilder
    fun setNumberOfStars(number: Long): ISkyBuilder
}