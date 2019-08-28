package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.BeanProperty
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.ContextualDeserializer
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.anton3.vkapi.vktypes.EnumParsingException
import name.anton3.vkapi.vktypes.ValueEnum

internal class ValueDeserializer(context: DeserializationContext) :
    StdDeserializer<ValueEnum<*>>(ValueEnum::class.java) {

    private val contextualType = context.contextualType
    private val wrappedType: JavaType = contextualType.findSuperType(ValueEnum::class.java)!!.containedType(0)!!

    @Suppress("ReplaceAssociateFunction")
    private val values: Map<Any?, ValueEnum<*>> =
        contextualType.rawClass.enumConstants!!.associate { it as ValueEnum<*>; it.value to it }

    override fun getValueType(): JavaType = contextualType

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ValueEnum<*> {
        val value = ctxt.readValue<Any?>(p, wrappedType)
        return values[value] ?: throw EnumParsingException(contextualType.rawClass, value)
    }
}

internal class ContextualValueDeserializer :
    StdDeserializer<ValueEnum<*>>(ValueEnum::class.java), ContextualDeserializer {

    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): ValueEnum<*> = throw NotImplementedError()

    override fun createContextual(ctxt: DeserializationContext, property: BeanProperty?): JsonDeserializer<*> =
        ValueDeserializer(ctxt)
}

@JsonDeserialize(using = ContextualValueDeserializer::class)
internal interface ValueMixin<out T> {
    @get:JsonValue
    val value: T
}
