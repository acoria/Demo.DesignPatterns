package structural.decorator.muesli

class OatsDecorator(private val muesli: IMuesli): IMuesli {
    override fun consistsOf(): String {
        return "${muesli.consistsOf()} + Oats"
    }
}