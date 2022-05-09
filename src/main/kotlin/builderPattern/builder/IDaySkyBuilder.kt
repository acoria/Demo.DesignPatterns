package builderPattern.builder

interface IDaySkyBuilder : ISkyBuilder {
    fun addSun(): ISkyBuilder
}