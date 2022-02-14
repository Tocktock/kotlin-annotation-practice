package components.component

import components.ShouldBeScan

@ShouldBeScan("header")
class Header : AbstractComponent {
    override fun render(): String {
        return """
            <header>
            someContent
            </header>
        """.trimIndent()
    }
}