package name.anton3.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import name.anton3.vkapi.vktypes.VkDate

object UnixTimeDeserializer : JsonDeserializer<VkDate>() {
    override fun deserialize(jp: JsonParser, ctxt: DeserializationContext): VkDate {
        val unixTime = jp.longValue
        return VkDate(unixTime * 1000)
    }
}
