package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import kotlin.reflect.KClass

class TypeSchemaDeserializer : StdDeserializer<TypeSchema>(TypeSchema::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): TypeSchema {
        val oc = p.codec
        if (p.isExpectedStartObjectToken) p.nextToken()
        val node: JsonNode = oc.readTree(p)

        val kind: KClass<out TypeSchema> = when {
            node.has("\$ref") -> RefType::class
            node.has("oneOf") -> OneOfType::class
            node.has("allOf") -> AllOfType::class
            node.has("type") && node["type"].textValue() == "array" -> ArrayType::class
            node.has("type") && node["type"].isArray -> SimpleMultiType::class
            node.has("enum") -> EnumType::class
            node.has("patternProperties") -> PatternPropertiesType::class
            !node.has("properties") -> SimpleType::class
            else -> ObjectType::class
        }

        return oc.treeToValue(node, kind.java)
    }
}
