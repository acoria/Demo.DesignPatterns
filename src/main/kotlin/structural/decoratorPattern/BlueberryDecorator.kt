package structural.decoratorPattern

class BlueberryDecorator(private val muesli: IMuesli): IMuesli {
    override fun consistsOf(): String {
        return "${muesli.consistsOf()} + Blueberries"
    }
}