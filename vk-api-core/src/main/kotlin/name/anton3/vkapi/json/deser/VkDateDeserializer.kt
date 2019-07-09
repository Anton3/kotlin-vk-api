package name.anton3.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import name.anton3.vkapi.vktypes.VkDate

internal object VkDateDeserializer : JsonDeserializer<VkDate>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): VkDate {
        return VkDate(p.longValue)
    }
}
