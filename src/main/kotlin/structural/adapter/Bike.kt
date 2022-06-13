package structural.adapter

class Bike : IBike {

    private var direction: Direction = Direction.STRAIGHT
    private var speed = 0

    override fun turnHandlebarsLeft(): String {
        direction = Direction.LEFT
        return tellDirection()
    }

    override fun turnHandlebarsRight(): String {
        direction = Direction.RIGHT
        return tellDirection()
    }

    override fun turnHandlebarsStraight(): String {
        direction = Direction.STRAIGHT
        return tellDirection()
    }

    override fun pedalFaster(): String {
        increaseSpeed()
        return tellSpeed()
    }

    override fun pedalSlower(): String {
        decreaseSpeed()
        return tellSpeed()
    }

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
        return "Riding with $speed km/h"
    }

    private fun tellDirection(): String {
        return "Riding $direction"
    }
}