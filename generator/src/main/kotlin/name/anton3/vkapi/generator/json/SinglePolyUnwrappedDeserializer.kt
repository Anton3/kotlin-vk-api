package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.deser.ContextualDeserializer
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.util.NameTransformer

class SinglePolyUnwrappedDeserializer<T : Any> : JsonDeserializer<T>(), ContextualDeserializer {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T = error("Not implemented")

    override fun createContextual(ctxt: DeserializationContext, property: BeanProperty?): JsonDeserializer<T> =
        SinglePolyUnwrappedDeserializerImpl(ctxt)
}

private class SinglePolyUnwrappedDeserializerImpl<T : Any>(ctxt: DeserializationContext) :
    StdDeserializer<T>(null as JavaType?) {

    private val type: JavaType = ctxt.contextualType
    private val beanDeserializer: JsonDeserializer<T>
    private val ownPropertyNames: Set<String>

    private val unwrappedType: JavaType
    private val unwrappedPropertyName: String
    private val nameTransformer: NameTransformer

    init {
        val description: BeanDescription = ctxt.config.introspect(type)

        var tempUnwrappedAnnotation: JsonUnwrapped? = null

        val unwrappedProperties = description.findProperties().filter { prop ->
            listOfNotNull(prop.field, prop.mutator, prop.constructorParameter).any { member ->
                val unwrappedAnnotation: JsonUnwrapped? = member.getAnnotation(JsonUnwrapped::class.java)
                if (unwrappedAnnotation != null) {
                    tempUnwrappedAnnotation = unwrappedAnnotation
                    member.allAnnotations.add(notUnwrappedAnnotation)
                }
                unwrappedAnnotation != null
            }
        }

        val unwrappedProperty = when (unwrappedProperties.size) {
            0 -> error("@JsonUnwrapped properties not found in ${type.typeName}")
            1 -> unwrappedProperties.single()
            else -> error("Multiple @JsonUnwrapped properties found in ${type.typeName}")
        }

        nameTransformer = tempUnwrappedAnnotation!!.run { NameTransformer.simpleTransformer(prefix, suffix) }

        unwrappedPropertyName = unwrappedProperty.name

        ownPropertyNames = description.findProperties().mapTo(mutableSetOf()) { it.name }
        ownPropertyNames.remove(unwrappedPropertyName)
        ownPropertyNames.removeAll(description.ignoredPropertyNames)

        unwrappedType = unwrappedProperty.primaryType

        val rawBeanDeserializer = ctxt.factory.createBeanDeserializer(ctxt, type, description)
        (rawBeanDeserializer as? ResolvableDeserializer)?.resolve(ctxt)
        @Suppress("UNCHECKED_CAST")
        beanDeserializer = rawBeanDeserializer as JsonDeserializer<T>
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T {
        val node = p.readValueAsTree<ObjectNode>()

        val ownFields: MutableMap<String, JsonNode> = mutableMapOf()
        val unwrappedFields: MutableMap<String, JsonNode> = mutableMapOf()

        node.fields().forEach { (key, value) ->
            val transformed: String? = nameTransformer.reverse(key)

            if (transformed != null && key !in ownPropertyNames) {
                unwrappedFields[transformed] = value
            } else {
                ownFields[key] = value
            }
        }

        ownFields[unwrappedPropertyName] = ObjectNode(ctxt.nodeFactory, unwrappedFields)

        val syntheticParser = p.codec.treeAsTokens(ObjectNode(ctxt.nodeFactory, ownFields))
        syntheticParser.nextToken()
        return beanDeserializer.deserialize(syntheticParser, ctxt)
    }

    private class NotUnwrapped(
        @Suppress("unused")
        @field:JsonUnwrapped(enabled = false)
        @JvmField
        val dummy: Nothing
    )

    companion object {
        private val notUnwrappedAnnotation: JsonUnwrapped =
            NotUnwrapped::class.java.getField("dummy").getAnnotation(JsonUnwrapped::class.java)
    }
}
