package name.alatushkin.vkapi.json.deser

import com.fasterxml.jackson.databind.BeanProperty
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.deser.ContextualDeserializer
import com.fasterxml.jackson.databind.deser.std.StdDeserializer

abstract class StrongStdDeserializer<T>(
    weakType: Class<T>,
    context: DeserializationContext? = null
) : StdDeserializer<T>(weakType), ContextualDeserializer {

    private val _valueType: JavaType? = context?.contextualType
    private var _context: DeserializationContext? = context

    override fun getValueType(): JavaType? = _valueType

    val context: DeserializationContext
        get() = _context!!

    override fun createContextual(ctxt: DeserializationContext, property: BeanProperty?): JsonDeserializer<*> {
        require(ctxt.contextualType?.isTypeOrSubTypeOf(handledType()) ?: true) { "Wrong base type" }
        return copy(ctxt)
    }

    abstract fun copy(context: DeserializationContext): StrongStdDeserializer<T>
}
