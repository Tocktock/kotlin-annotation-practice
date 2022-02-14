package annotated.tutorial.temp

@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.RUNTIME)
annotation class MyAnnotation
