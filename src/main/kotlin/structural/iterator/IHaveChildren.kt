package structural.iterator

interface IHaveChildren<T> {
    fun getChildren(): List<T>
    fun addChild(child: T)
}