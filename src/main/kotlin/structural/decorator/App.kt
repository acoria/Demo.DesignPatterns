package structural.decorator

fun main() {
    println("Your muesli consists of:")
    println(BlueberryDecorator(OatsDecorator(NutDecorator(Muesli()))).consistsOf())
}