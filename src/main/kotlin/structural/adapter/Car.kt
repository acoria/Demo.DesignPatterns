package structural.adapter

class Car : ICar {

    private var direction: Direction = Direction.STRAIGHT
    private var speed = 0
    private var engineRunning = false

    private fun increaseSpeed() {
        speed += 10
    }

    private fun decreaseSpeed() {
        speed -= 10
        if (speed < 0) {
            speed = 0
        }
    }

    private fun tellSpeed(): String {
        return "Driving with $speed km/h"
    }

    private fun tellDirection(): String {
        return "Driving $direction"
    }

    override fun startEngine(): String {
        engineRunning = true
        return "Engine running"
    }

    override fun goLeft(): String {
        direction = Direction.LEFT
        return tellDirection()
    }

    override fun goRight(): String {
        direction = Direction.RIGHT
        return tellDirection()
    }

    override fun goStraightOn(): String {
        direction = Direction.STRAIGHT
        return tellDirection()
    }

    override fun accelerate(): String {
        increaseSpeed()
        return tellSpeed()
    }

    override fun decelerate(): String {
        decreaseSpeed()
        return tellSpeed()
    }
}