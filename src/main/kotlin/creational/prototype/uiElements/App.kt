package creational.prototype.uiElements

fun main() {
    val elementRepository: IElementRepository = ElementRepository()

    val whiteButton = Button().apply { elementRepository.add(this) }
    val redButton = Button("red").apply { elementRepository.add(this) }
    val blueButton = Button("blue").apply {
        width = 30
        height = 20
        elementRepository.add(this)
    }
    val greenInputField = InputField("green").apply { elementRepository.add(this) }
    val yellowInputField = InputField("yellow").apply { elementRepository.add(this) }
    val redInputField = InputField("red").apply { elementRepository.add(this) }

    val newBlueButton = elementRepository.find<IButton>("blueButton").clone<IButton>()
}