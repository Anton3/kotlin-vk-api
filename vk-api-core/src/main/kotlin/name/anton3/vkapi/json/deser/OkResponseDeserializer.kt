package name.anton3.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.anton3.vkapi.vktypes.OkResponse
import name.anton3.vkapi.vktypes.PropertyExists
import java.io.IOException

object OkResponseDeserializer : StdDeserializer<OkResponse>(PropertyExists::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): OkResponse {
        val value = p.readValueAs(Int::class.java)
        if (value != 1) throw IOException("Incorrect value $value, should be 1")
        return OkResponse
    }
}
