package behavioural.visitor

class PainterVisitor : IVisitor<String> {

    override fun visit(animal: Animal): String {
        return "A ${animal.getFurColor()} animal laying in the shade of the tree."
    }

    override fun visit(tree: Tree): String {
        return "A tree dropping ${tree.getLeafShape()} leaves into the water."
    }

    override fun visit(human: Human): String {
        return "A ${human.getBodyStatue()} human walking along the beach."
    }
}