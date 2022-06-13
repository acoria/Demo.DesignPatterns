package structural.adapter

class BikeToCarAdapter(private val bike: IBike) : ICarAdapter {
    override fun startEngine(): String {
        //not necessary -> no engine needed
        //think about telling rider to get ready and warm up
        return ""
    }

    override fun goLeft(): String {
        return bike.turnHandlebarsLeft()
    }

    override fun goRight(): String {
        return bike.turnHandlebarsRight()
    }

    override fun goStraightOn(): String {
        return bike.turnHandlebarsStraight()
    }

    override fun accelerate(): String {
        return bike.pedalFaster()
    }

    override fun decelerate(): String {
        return bike.pedalSlower()
    }
}