package name.anton3.vkapi.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.type.TypeFactory
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

inline fun <reified T: JsonNode> JsonParser.readNode(): T {
    val node = codec.readTree<JsonNode>(this)
    return node as? T ?: throw JsonMappingException(this, "Expected ${T::class.simpleName}")
}

inline fun <reified T> weakType(): Class<T> {
    return T::class.java
}

inline fun <reified T> strongType(): JavaType {
    return TypeFactory.defaultInstance().constructType(jacksonTypeRef<T>())!!
}
