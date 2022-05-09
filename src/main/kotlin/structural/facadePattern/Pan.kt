package structural.facadePattern

class Pan {
    fun fry(food: IFood) {
        println("${food.name} frying")
    }
}