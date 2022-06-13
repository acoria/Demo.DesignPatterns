package structural.adapter

fun main() {
    println("Drive a car:")
    Driver(Car()).drive()
    println("Drive a car using a bike:")
    Driver(BikeToCarAdapter(Bike())).drive()
}