package structural.iterator

class Node(override val id: String) : INode {
    private val children = mutableListOf<INode>()

    override fun getChildren(): List<INode> {
        return children
    }

    override fun addChild(child: INode) {
        children.add(child)
    }
}