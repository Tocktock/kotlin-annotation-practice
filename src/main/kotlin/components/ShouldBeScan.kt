package components

@Target(AnnotationTarget.CLASS)
annotation class ShouldBeScan(
    val info: String,
)