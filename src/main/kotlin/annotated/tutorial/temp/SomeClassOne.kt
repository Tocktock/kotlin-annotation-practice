package annotated.tutorial.temp

@MyAnnotation
class SomeClassOne(
    @ShouldBe val should: String,
    @ShouldNotBe val shouldNot: String,
    @ShouldBe var noProperty: String,
) {
    @ShouldBe
    val tata: String = "verify"
}