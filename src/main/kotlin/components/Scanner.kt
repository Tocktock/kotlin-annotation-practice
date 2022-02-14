package components

import components.component.AbstractComponent
import org.reflections.ReflectionUtils.*
import org.reflections.Reflections
import org.reflections.scanners.Scanners.*
import java.lang.reflect.Method


class Scanner {
    fun getBeanMethods(clazz: Class<*>?, annotation: Class<out Annotation?>?): Set<Method?>? {
        return getAllMethods(clazz, withAnnotation(annotation))
    }

    fun scanAll() {
        val reflections = Reflections("components")
//        val annotated = reflections[TypesAnnotated.with(
//            ShouldBeScan::class.java
//        ).asClass<AbstractComponent>()]
        val annotated = reflections.getTypesAnnotatedWith(ShouldBeScan::class.java)

        annotated.forEach {
            getBeanMethods(it, ShouldBeScan::class.java)?.forEach { method ->
                println(method?.name)
            }
        }
    }
}