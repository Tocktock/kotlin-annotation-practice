package annotated.tutorial.serializer

import org.junit.jupiter.api.Test
import serializer.JsonMapper
import serializer.MyClass
import serializer.RequestDTO
import kotlin.test.assertEquals


internal class JsonMapperTest {
    @Test
    fun toJsonTest() {
        val dto = RequestDTO(
            username = "TARS",
            email = "tars@nasa.ai",
            address = "top secret",
            phoneNumber = "010xxxxxxxx",
            age = 15,
            zmyClass = MyClass("1234")
        )
        val serializer = JsonMapper()
        val result = serializer.toJsonString(dto)
        println(result)
        assertEquals(
            result,
            """{"age":"15","accessId":"tars@nasa.ai","phoneNumber":"010xxxxxxxx","username":"TARS","zmyClass":{"myField":"1234"}}"""
        )
    }
}
