package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import name.anton3.vkapi.vktypes.VkBirthDate

internal object VkBirthDateDeserializer : JsonDeserializer<VkBirthDate>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): VkBirthDate {
        val dateValue = p.text ?: throw JsonMappingException(p, "Expected string", p.currentLocation)

        val date = dateValue.split(".").filter { it.isNotBlank() }

        return try {
            when (date.size) {
                2 -> VkBirthDate(date[0].toInt(), date[1].toInt(), 0)
                3 -> VkBirthDate(date[0].toInt(), date[1].toInt(), date[2].toInt())
                else -> throw JsonMappingException(p, "Incorrect birthday format", p.currentLocation)
            }
        } catch (e: NumberFormatException) {
            throw JsonMappingException(p, "Incorrect birthday parts", e)
        }
    }
}

internal object VkBirthDateSerializer : StdSerializer<VkBirthDate>(VkBirthDate::class.java) {
    override fun serialize(value: VkBirthDate, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeString("${value.day}.${value.month}.${value.year}")
    }
}
