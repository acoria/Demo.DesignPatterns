package behavioural.chainOfResponsibility

fun main() {
    val motorcycle = Motorcycle()
    val car = Car().also { motorcycle.setNext(it) }
    val bus = Bus().also { car.setNext(it) }

    val resultPair = motorcycle.callNextChainElement( 4)
    resultPair.first?.let { println("Your ride for the trip: --> ${it::class.simpleName} <-- with ${resultPair.second} leftover seat(s)") }
        ?: println("Sorry, we have no vehicle to suit your needs")
}