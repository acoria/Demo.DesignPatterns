package structural.facade

class Pan {
    fun fry(food: IFood) {
        println("${food.name} frying")
    }
}