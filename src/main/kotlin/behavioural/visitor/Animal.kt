package behavioural.visitor

class Animal : IVisitable {
    override fun <T> accept(visitor: IVisitor<T>): T? {
        return visitor.visit(this)
    }

    fun getFurColor(): String {
        return "black and white"
    }
}