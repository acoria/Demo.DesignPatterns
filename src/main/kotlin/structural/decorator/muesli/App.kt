package structural.decorator.muesli

fun main() {
    println("Your muesli consists of:")
    println(BlueberryDecorator(OatsDecorator(NutDecorator(Muesli()))).consistsOf())
}