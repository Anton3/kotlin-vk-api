package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer

object MethodResponsesDeserializer : StdDeserializer<MethodResponses>(MethodResponses::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): MethodResponses {
        val oc = p.codec

        if (p.isExpectedStartObjectToken) p.nextToken()
        val node: JsonNode = oc.readTree(p)

        val kind = when {
            node.has("userIdsResponse") -> UserIdsResponse::class
            node.has("needMutualResponse") -> NeedMutualResponse::class
            node.has("targetUidsResponse") -> TargetUidsResponse::class
            node.has("onlineMobileResponse") -> OnlineMobileResponse::class
            node.has("filterResponse") -> MethodFieldWithFilterResponses::class
            node.has("fieldsResponse") -> FieldsResponses::class
            node.has("schoolsResponse") -> SuggestMethodResponses::class
            node.has("extendedResponse") -> MethodExtendedResponses::class
            else -> BasicMethodResponses::class
        }

        return oc.treeToValue(node, kind.java)
    }
}
