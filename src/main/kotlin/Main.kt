//fun main() {}

//fun writeAsString(obj: Any): String {
//    if (obj::class.findAnnotation<DoJsonMap>() == null) return ""
//    var jsonString = "{"
//    obj::class.memberProperties.forEach {
//        if (!it.returnType.toString().contains("kotlin")) {
//            jsonString = """$jsonString"${it.name}":${writeAsString(it.getter.call(obj)!!)},"""
//            return@forEach
//        }
//        if (it.findAnnotation<ExcludeJsonField>() != null) return@forEach
//        val fieldName = it.findAnnotation<ChangeJsonFieldName>()?.changeTo ?: it.name
//        jsonString = """$jsonString"${fieldName}:"${it.getter.call(obj)}","""
//    }
//    jsonString = jsonString.substring(0, jsonString.length - 1)
//    return "$jsonString}"
//}
//fun main(args: Array<String>) {
//    println("Hello World!")
//    val someClassOne = SomeClassOne(should = "should", shouldNot = "shouldNot","noProperty Value")
//    printAnnotatedWithShouldBe<ShouldBe>(someClassOne)
//}
//
//inline fun <reified T : Annotation>printAnnotatedWithShouldBe(obj: Any) {
////    obj::class.memberProperties.filter { it.findAnnotation<T>() != null }.forEach {
////        println("${it.name} : ${it.getter.call(obj)}")
////    }
////    obj.javaClass.declaredFields.forEach { f ->
////        if (f.isAnnotationPresent(ShouldBe::class.java)) {
////            f.trySetAccessible()
////            println("${f.name} ${f.get(obj)}")
////        }
////    }
//    obj::class.memberProperties.filter { it.findAnnotation<ShouldBe>() != null }.forEach {
//        println("${it.name} : ${it.getter.call(obj)}")
//    }
//}