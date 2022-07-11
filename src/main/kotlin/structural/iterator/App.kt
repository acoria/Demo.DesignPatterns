package structural.iterator

fun main() {
    val rootNode = Node("1.0")
    val node11 = Node("1.1")
    val node12 = Node("1.2")
    rootNode.addChild(node11)
    rootNode.addChild(node12)
    val node110 = Node("1.1.0")
    node11.addChild(node110)
    val node1100 = Node("1.1.0.0")
    val node111 = Node("1.1.1")
    node11.addChild(node111)
    node110.addChild(node1100)
    val node120 = Node("1.2.0")
    node12.addChild(node120)

    repeat(2) {
        val childrenIterator = ChildrenIterator(rootNode)
        while (childrenIterator.hasNext()) {
            println(childrenIterator.next().id)
        }
        childrenIterator.reset()
    }
}