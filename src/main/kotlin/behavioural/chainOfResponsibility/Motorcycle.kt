package behavioural.chainOfResponsibility

class Motorcycle : IVehicle, ITripVehicleFinderChainable {
    private var chainable: IChainable<Int, Pair<IVehicle?, Int>>? = null
    private val numberOfSeats = 2

    override fun setNext(chainable: IChainable<Int, Pair<IVehicle?, Int>>) {
        this.chainable = chainable
    }

    override fun callNextChainElement(data: Int): Pair<IVehicle?, Int> {
        val availableSeats = numberOfSeats - data
        return if (availableSeats >= 0) {
            Pair(this, availableSeats)
        } else {
            chainable?.let { return@let it.callNextChainElement(data) } ?: Pair(null, 0)
        }
    }
}