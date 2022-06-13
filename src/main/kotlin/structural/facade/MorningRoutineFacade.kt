package structural.facade

class MorningRoutineFacade : IMorningRoutineFacade {
    private val phone: Phone by lazy { Phone() }
    override fun makeBreakfast() {
        phone.turnOnMusic()
        CoffeeMachine().makeCoffee()
        Pan().fry(Egg())
        Muesli()
    }

    override fun doSports() {
        phone.turnOnMusic()
        Matt().rollOut()
    }
}