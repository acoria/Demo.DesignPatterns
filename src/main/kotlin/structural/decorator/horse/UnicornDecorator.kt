package structural.decorator.horse

class UnicornDecorator(private val horse: IHorse) : IHorse {
    override fun appear(): String {
        return "${horse.appear()} with unicorn horn"
    }
}