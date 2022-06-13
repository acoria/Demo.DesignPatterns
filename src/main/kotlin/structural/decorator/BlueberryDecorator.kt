package structural.decorator

class BlueberryDecorator(private val muesli: IMuesli): IMuesli {
    override fun consistsOf(): String {
        return "${muesli.consistsOf()} + Blueberries"
    }
}