package creational.prototype.tree

fun main() {
    //instead of different subclasses for specific configurations, objects can be configured and cloned when needed
    val pine = Tree(TreeType.NEEDLE)
    repeat(10) {
        pine.itsYourBirthday()
    }
    pine.soil = "mossy"
    pine.levelOfLightRequired = "little"
    pine.litresOfWaterRequired = 10
    println("The pine tree is ${pine.height}m high")

    val pineClone = pine.clone()
    println("The pine clone tree is also ${pineClone.height}m high and needs ${pineClone.soil} soil, ${pineClone.levelOfLightRequired} light and ${pineClone.litresOfWaterRequired}l of water")
}