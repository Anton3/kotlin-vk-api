package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.module.kotlin.readValue
import name.anton3.vkapi.json.core.vkBaseObjectMapper
import name.anton3.vkapi.vktypes.ValueEnum
import org.junit.Assert.assertEquals
import org.junit.Test

class ValueDeserializerTest {

    private val objectMapper = vkBaseObjectMapper()

    private enum class StringEnum(override val value: String) : ValueEnum<String> {
        A("a"),
        B("b")
    }

    @Test
    fun deserializeStringEnum() {
        assertEquals(StringEnum.B, objectMapper.readValue<StringEnum>("\"b\""))
        assertEquals(listOf(StringEnum.A), objectMapper.readValue<List<StringEnum>>("""["a"]"""))
    }


    private enum class IntEnum(override val value: Int) : ValueEnum<Int> {
        A(1),
        B(2)
    }

    @Test
    fun deserializeIntEnum() {
        assertEquals(IntEnum.B, objectMapper.readValue<IntEnum>("2"))
        assertEquals(listOf(IntEnum.A), objectMapper.readValue<List<IntEnum>>("[1]"))
    }

    @Test
    fun deserializeAndSerializeIntEnum() {
        assertEquals("2", objectMapper.writeValueAsString(objectMapper.readValue<IntEnum>("2")))
        assertEquals("[2]", objectMapper.writeValueAsString(objectMapper.readValue<List<IntEnum>>("[2]")))
    }

    @Test
    fun serializeAndDeserializeIntEnum() {
        assertEquals(IntEnum.B, objectMapper.readValue<IntEnum>(objectMapper.writeValueAsString(IntEnum.B)))
        assertEquals(
            listOf(IntEnum.B),
            objectMapper.readValue<List<IntEnum>>(objectMapper.writeValueAsString(listOf(IntEnum.B)))
        )
    }
}
