package creational.factory.factoryMethod

abstract class GovernmentOffice {

    private val pileOfEmptyDocuments = mutableListOf(OfficialDocument(), OfficialDocument())

    abstract fun createStamp(): IStamp

    private fun prepareOfficialDocument() {
        val officialDocument = pileOfEmptyDocuments.last()
        pileOfEmptyDocuments.removeLast()
        officialDocument.addStamp(createStamp())
        println("Official document '${officialDocument.name}' with '${officialDocument.stamp.get()}' is ready to be picked up")
    }

    fun askForOfficialDocument() {
        prepareOfficialDocument()
    }

    fun phone() {
        println("Hello, how may I not help you?")
    }
}