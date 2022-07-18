package behavioural.visitor

class Tree : IVisitable {
    override fun <T> accept(visitor: IVisitor<T>): T? {
        return visitor.visit(this)
    }

    fun getLeafShape(): String {
        return "round"
    }
}