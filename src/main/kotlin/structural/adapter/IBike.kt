package structural.adapter

interface IBike {
    fun turnHandlebarsLeft() : String
    fun turnHandlebarsRight(): String
    fun turnHandlebarsStraight(): String
    fun pedalFaster(): String
    fun pedalSlower(): String
}