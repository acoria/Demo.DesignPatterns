package creational.prototype.tree

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
        return Tree(type).also {
            it.age = age
            it.levelOfLightRequired = levelOfLightRequired
            it.litresOfWaterRequired = litresOfWaterRequired
            it.soil = soil
        }
    }
}