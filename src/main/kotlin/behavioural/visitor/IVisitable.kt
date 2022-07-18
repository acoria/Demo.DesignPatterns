package behavioural.visitor

interface IVisitable {
    fun <T> accept(visitor: IVisitor<T>): T?
}