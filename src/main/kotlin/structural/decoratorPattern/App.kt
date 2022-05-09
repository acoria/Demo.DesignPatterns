package structural.decoratorPattern

fun main() {
    println("Your muesli consists of:")
    println(BlueberryDecorator(OatsDecorator(NutDecorator(Muesli()))).consistsOf())
}