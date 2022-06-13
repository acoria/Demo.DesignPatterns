package creational.builder.builder

interface IDaySkyBuilder : ISkyBuilder {
    fun addSun(): ISkyBuilder
}