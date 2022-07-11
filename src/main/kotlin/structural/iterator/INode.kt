package structural.iterator

interface INode : IHaveChildren<INode> {
    val id: String
    override fun getChildren(): List<INode>
    override fun addChild(child: INode)
}