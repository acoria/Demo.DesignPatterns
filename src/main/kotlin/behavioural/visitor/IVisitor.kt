package behavioural.visitor

interface IVisitor<T> {
    fun visit(animal: Animal): T?
    fun visit(tree: Tree): T?
    fun visit(human: Human): T?
}