package name.anton3.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.anton3.vkapi.methods.longpoll.objects.Flags

object FlagsDeserializer : StdDeserializer<Flags>(Flags::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Flags {
        return Flags(p.longValue)
    }
}
