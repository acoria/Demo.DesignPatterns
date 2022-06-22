package creational.singleton

class Highlander private constructor() {

    companion object {
        private val highlanderInstance by lazy { Highlander() }
        fun getInstance(): Highlander {
            return highlanderInstance
        }
    }

    fun talk() {
        println("There can be only one! -> I am '$this.'")
    }
}