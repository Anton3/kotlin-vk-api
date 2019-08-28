package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.BeanProperty
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.ContextualDeserializer
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.anton3.vkapi.vktypes.Value
import java.io.IOException

internal class EnumParsingException(type: JavaType, value: Any?) :
    IOException("Could not find case of enum ${type.typeName} matching value $value")

internal class ValueDeserializer(context: DeserializationContext) : StdDeserializer<Value<*>>(Value::class.java) {

    private val contextualType = context.contextualType
    private val wrappedType: JavaType = contextualType.findSuperType(Value::class.java)!!.containedType(0)!!

    @Suppress("ReplaceAssociateFunction")
    private val values: Map<Any?, Value<*>> =
        contextualType.rawClass.enumConstants!!.associate { it as Value<*>; it.value to it }

    override fun getValueType(): JavaType = contextualType

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Value<*> {
        val value = ctxt.readValue<Any?>(p, wrappedType)
        return values[value] ?: throw EnumParsingException(contextualType, value)
    }
}

internal class ContextualValueDeserializer : StdDeserializer<Value<*>>(Value::class.java), ContextualDeserializer {
    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): Value<*> = throw NotImplementedError()

    override fun createContextual(ctxt: DeserializationContext, property: BeanProperty?): JsonDeserializer<*> =
        ValueDeserializer(ctxt)
}

@JsonDeserialize(using = ContextualValueDeserializer::class)
internal interface ValueMixin
