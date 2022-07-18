package behavioural.visitor

fun main() {
    val visitables = listOf(Human(), Tree(), Animal())
    val painterVisitor: IVisitor<String> = PainterVisitor()
    visitables.forEach { it.accept(painterVisitor) }
}