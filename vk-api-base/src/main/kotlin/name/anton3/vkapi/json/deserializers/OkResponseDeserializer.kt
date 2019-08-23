package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import name.anton3.vkapi.vktypes.OkResponse
import name.anton3.vkapi.vktypes.PropertyExists
import java.io.IOException

internal object OkResponseDeserializer : StdDeserializer<OkResponse>(PropertyExists::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): OkResponse {
        val value = p.readValueAs(Int::class.java)
        if (value != 1) throw IOException("Incorrect value $value, should be 1")
        return OkResponse
    }
}

internal object OkResponseSerializer : StdSerializer<OkResponse>(OkResponse::class.java) {
    override fun serialize(value: OkResponse, gen: JsonGenerator, provider: SerializerProvider) {
        gen.writeNumber(1)
    }
}
