package components.component

import components.ShouldBeScan

@ShouldBeScan("body")
class Body : AbstractComponent {
    override fun render(): String {
        return """
            <body>
            someContent
            </body>
        """.trimIndent()
    }
}