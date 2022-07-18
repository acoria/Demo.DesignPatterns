package behavioural.visitor

class Human : IVisitable {
    override fun <T> accept(visitor: IVisitor<T>): T? {
        return visitor.visit(this)
    }

    fun getBodyStatue(): String {
        return "slender"
    }
}