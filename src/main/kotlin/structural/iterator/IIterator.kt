package structural.iterator

interface IIterator<T> {
    fun next(): T
    fun hasNext(): Boolean
    fun reset()
    fun registerOnReset(callback: (IIterator<T>) -> Unit)
}