package structural.decorator.horse

fun main() {
    println(UnicornDecorator(PegasusDecorator(Horse())).appear())
}