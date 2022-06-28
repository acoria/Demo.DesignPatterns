package creational.prototype.uiElements

class Button(override var color: String = "white") : IButton {
    override var width = 0
    override var height = 0
    override var name = "$color${Button::class.simpleName}"
    override fun <IButton> clone(): IButton {
        return Button().also {
            it.width = width
            it.height = height
        } as IButton
    }
}