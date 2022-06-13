package creational.builder.model

import java.lang.StringBuilder

class Sky(
    private val sun: Sun? = null,
    private val moon: Moon? = null,
    private val numberOfStars: Long? = null,
    private val percentageCoveredByClouds: Int?,
    private val rain: Rain?,
    private val color: String? = "blue",
) {
    fun looksLike(): String {
        return StringBuilder().apply {
            appendLine("The sky is $color")
            sun?.let { appendLine("The sun is shining") }
            moon?.let { appendLine("The moon is up") }
            numberOfStars?.apply {
                if (this > 0) {
                    appendLine("$this stars are sparkling")
                }
            }
            percentageCoveredByClouds?.apply {
                if (percentageCoveredByClouds > 0) {
                    appendLine("You can see $percentageCoveredByClouds% of $color sky. The rest is covered in clouds")
                } else {
                    appendLine("There are no clouds")
                }
            }
            rain?.let { "It is raining" }
        }.toString()
    }
}