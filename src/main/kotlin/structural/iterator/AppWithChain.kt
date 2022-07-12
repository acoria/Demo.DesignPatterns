package structural.iterator

interface IChainRing {
    val id: Int
    var linkedNeighbour: IChainRing?
}

class ChainRing : IChainRing {
    override val id: Int
    override var linkedNeighbour: IChainRing? = null

    init {
        numberOfLinks += 1
        id = numberOfLinks
    }

    companion object {
        private var numberOfLinks = 0
    }
}

fun main() {
    val rootChainRing = ChainRing()
    val chainRing1 = ChainRing().apply { rootChainRing.linkedNeighbour = this }
    val chainRing2 = ChainRing().apply { chainRing1.linkedNeighbour = this }
    val chainIterator = GenericIterator<IChainRing>(rootChainRing) {
        var list = listOf<IChainRing>()
        it.linkedNeighbour?.let { neighbour -> list = listOf(neighbour) }
        return@GenericIterator list
    }
    while (chainIterator.hasNext()) {
        println(chainIterator.next().id)
    }
}