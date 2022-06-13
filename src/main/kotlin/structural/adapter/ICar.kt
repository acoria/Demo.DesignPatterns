package structural.adapter

interface ICar {
    fun startEngine(): String
    fun goLeft(): String
    fun goRight(): String
    fun goStraightOn(): String
    fun accelerate(): String
    fun decelerate(): String
}