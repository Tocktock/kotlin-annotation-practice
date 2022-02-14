package serializer

@Target(AnnotationTarget.PROPERTY)
annotation class ChangeJsonFieldName(
    val changeTo: String
)
