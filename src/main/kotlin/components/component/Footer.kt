package components.component

import components.ShouldBeScan

@ShouldBeScan("footer")
class Footer : AbstractComponent {
    override fun render(): String {
        return """
            <footer>
            someContent
            </footer>
        """.trimIndent()
    }
}