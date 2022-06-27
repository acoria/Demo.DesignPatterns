package creational.prototype

class Tree(private val type: TreeType) : ITree {
    //age and type are private and cannot be retrieved to make a copy if it is not cloned
    private var age = 0
    override var height = 0
        get() = age / 2
        private set
    override var levelOfLightRequired: String = "light"
    override var litresOfWaterRequired: Int = 3
    override var soil: String = "sandy"
    override fun itsYourBirthday() {
        age++
    }

    override fun clone(): ITree {
        val tree = Tree(type)
        tree.age = age
        tree.levelOfLightRequired = levelOfLightRequired
        tree.litresOfWaterRequired = litresOfWaterRequired
        tree.soil = soil
        return tree
    }
}