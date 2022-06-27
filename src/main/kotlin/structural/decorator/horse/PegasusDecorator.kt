package structural.decorator.horse

class PegasusDecorator(private val horse: IHorse) : IHorse {
    override fun appear(): String {
        return "${horse.appear()} with wings"
    }
}