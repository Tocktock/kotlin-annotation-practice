package serializer

@DoJsonMap
data class RequestDTO(
    val username: String,
    @ChangeJsonFieldName(changeTo = "accessId")
    val email: String,
    @ExcludeJsonField val address: String,
    val phoneNumber: String,
    val age: Int,
    val zmyClass: MyClass,
)

@DoJsonMap
data class MyClass(
    val myField: String
)