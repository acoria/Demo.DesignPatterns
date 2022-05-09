package structural.decoratorPattern

class NutDecorator(private val muesli: IMuesli) : IMuesli {
    override fun consistsOf(): String {
        return "${muesli.consistsOf()} + Nuts"
    }
}