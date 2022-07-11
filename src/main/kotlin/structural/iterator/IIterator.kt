package structural.iterator

interface IIterator<T> {
    fun next(): T
    fun hasNext(): Boolean
    fun reset()
}