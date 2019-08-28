package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.module.kotlin.readValue
import name.anton3.vkapi.json.core.vkBaseObjectMapper
import name.anton3.vkapi.vktypes.Value
import org.junit.Assert.assertEquals
import org.junit.Test

class ValueDeserializerTest {

    private val objectMapper = vkBaseObjectMapper()

    private enum class StringEnum(override val value: String) : Value<String> {
        A("a"),
        B("b")
    }

    @Test
    fun deserializeStringEnum() {
        assertEquals(StringEnum.B, objectMapper.readValue<StringEnum>(""" "b" """))
        assertEquals(listOf(StringEnum.A), objectMapper.readValue<List<StringEnum>>("""["a"]"""))
    }


    private enum class IntEnum(override val value: Int) : Value<Int> {
        A(1),
        B(2)
    }

    @Test
    fun deserializeIntEnum() {
        assertEquals(IntEnum.B, objectMapper.readValue<IntEnum>(""" 2 """))
        assertEquals(listOf(IntEnum.A), objectMapper.readValue<List<IntEnum>>("""[1]"""))
    }
}
