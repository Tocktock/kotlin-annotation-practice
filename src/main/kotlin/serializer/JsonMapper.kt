package serializer

import kotlin.reflect.KProperty1
import kotlin.reflect.KType
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

class JsonMapper {
    fun toJsonString(obj: Any): String {
        if (isJsonMapAnnotated(obj)) return ""
        var jsonString = "{"
        obj::class.memberProperties.forEach {
            if (!isBasicClass(it.returnType)) {
                val fieldName = extractFieldName(it)
                jsonString += addField(fieldName, toJsonString(it.getter.call(obj)!!))
                return@forEach
            }
            if (isExcludedField(it)) return@forEach
            val fieldName = extractFieldName(it)
            jsonString += addField(fieldName, """"${it.getter.call(obj)}"""")
        }
        jsonString = jsonString.substring(0, jsonString.length - 1)
        return "$jsonString}"
    }

    private fun isJsonMapAnnotated(obj: Any) = obj::class.findAnnotation<DoJsonMap>() == null
    private fun isBasicClass(property: KType) = property.toString().startsWith("kotlin")
    private fun isExcludedField(property: KProperty1<out Any, *>) = property.findAnnotation<ExcludeJsonField>() != null
    private fun extractFieldName(property: KProperty1<out Any, *>) =
        property.findAnnotation<ChangeJsonFieldName>()?.changeTo ?: property.name

    private fun addField(fieldName: String, value: String): String {
        return """"$fieldName":$value,"""
    }

}