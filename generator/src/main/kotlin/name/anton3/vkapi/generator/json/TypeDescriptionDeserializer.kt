package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import kotlin.reflect.KClass

object ObjectSchemaDeserializer : StdDeserializer<TypeDescription>(TypeDescription::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): TypeDescription {
        val oc = p.codec
        val node: JsonNode = oc.readTree(p)

        val kind: KClass<out TypeDescription> = when {
            node.has("\$ref") -> RefObject::class
            node.has("oneOf") -> OneOfObject::class
            node.has("allOf") -> AllOfObject::class
            node.has("type") && node["type"].textValue() == "array" -> ArrayObject::class
            node.has("type") && node["type"].isArray -> SimpleObjectMultiType::class
            node.has("enum") -> EnumObject::class
            node.has("patternProperties") -> ObjectWithPatternProperties::class
            !node.has("properties") -> SimpleObject::class
            else -> GeneralObject::class
        }

        return oc.treeToValue(node, kind.java)
    }
}
