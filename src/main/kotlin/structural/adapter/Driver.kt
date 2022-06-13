package structural.adapter

class Driver(private val car: ICar) {
    fun drive() {
        println(car.startEngine())
        println(car.accelerate())
        println(car.goLeft())
        println(car.accelerate())
        println(car.goStraightOn())
        println(car.decelerate())
    }
}