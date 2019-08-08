package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.BeanProperty
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.deser.ContextualDeserializer

internal class ContextualDeserializerBuilder<T>(private val build: (DeserializationContext) -> JsonDeserializer<T>)
    : JsonDeserializer<T>(), ContextualDeserializer {

    override fun createContextual(ctxt: DeserializationContext, property: BeanProperty?): JsonDeserializer<*> {
        return build(ctxt)
    }

    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): T {
        throw NotImplementedError("DeserializerBuilder should be contextualized before use")
    }
}
