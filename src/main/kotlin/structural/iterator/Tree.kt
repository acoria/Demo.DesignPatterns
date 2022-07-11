package structural.iterator

class Tree(private val rootNode: INode) : ITree {
    override fun getRootNode(): INode {
        return rootNode
    }
}