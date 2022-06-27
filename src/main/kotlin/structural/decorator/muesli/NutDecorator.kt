package structural.decorator.muesli

class NutDecorator(private val muesli: IMuesli) : IMuesli {
    override fun consistsOf(): String {
        return "${muesli.consistsOf()} + Nuts"
    }
}