package structural.decorator.muesli

class BlueberryDecorator(private val muesli: IMuesli): IMuesli {
    override fun consistsOf(): String {
        return "${muesli.consistsOf()} + Blueberries"
    }
}