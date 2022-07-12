package structural.iterator

fun main() {
    val rootNode = Node("1")
    val node11 = Node("1.1")
    val node12 = Node("1.2")
    rootNode.addChild(node11)
    rootNode.addChild(node12)
    val node111 = Node("1.1.1")
    node11.addChild(node111)
    val node1111 = Node("1.1.1.1")
    val node112 = Node("1.1.2")
    node11.addChild(node112)
    node111.addChild(node1111)
    val node121 = Node("1.2.1")
    node12.addChild(node121)

//    testIterator(GenericIterator(rootNode) { it.getChildren() })
    testIterator(LevelIterator<INode>(rootNode, 2) { it.getChildren() })
}

fun testIterator(iterator: IIterator<INode>, repeatTimes: Int = 1) {
    repeat(repeatTimes) {
        while (iterator.hasNext()) {
            println(iterator.next().id)
        }
        iterator.reset()
    }
}