package creational.prototype.uiElements

class InputField(override var color: String = "white") : IInputField {
    override var width = 10
    override var height = 5
    override var name = InputField::class.simpleName.toString()
    override fun <IInputField> clone(): IInputField {
        return InputField().also {
            it.width = width
            it.height = height
        } as IInputField
    }
}