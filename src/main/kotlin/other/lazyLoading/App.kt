package other.lazyLoading

fun main() {
    val printerDriverLazy = lazy { PrinterDriver() }
    val printerDriver = printerDriverLazy.instance
}