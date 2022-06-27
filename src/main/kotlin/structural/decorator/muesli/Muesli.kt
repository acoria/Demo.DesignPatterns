package structural.decorator.muesli

class Muesli : IMuesli {
    private val ingredients = listOf(MuesliIngredient("Milk"))
    override fun consistsOf(): String {
        var ingredientList = ""
        ingredients.forEachIndexed { index, ingredient ->
            if(index == 0) {
                ingredientList = ingredient.name
            }else{
                ingredientList = "$ingredientList + ${ingredient.name}"
            } }
        return ingredientList
    }
}