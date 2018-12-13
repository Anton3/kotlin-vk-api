package name.alatushkin.api.vk.json.desersupport

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.type.TypeFactory
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.KClass

inline fun <reified T: JsonNode> JsonParser.readNode(): T {
    if (isExpectedStartObjectToken || isExpectedStartArrayToken) nextToken()
    val node = codec.readTree<JsonNode>(this)
    return node as? T ?: throw JsonMappingException(this, "Expected ${T::class.simpleName}")
}

fun unknownCollection(klass: KClass<*>): JavaType {
    return TypeFactory.defaultInstance().constructCollectionLikeType(klass.java, TypeFactory.unknownType())
}

inline fun <reified T> weakType(): Class<T> {
    return T::class.java
}

inline fun <reified T> strongType(): JavaType {
    return TypeFactory.defaultInstance().constructType(jacksonTypeRef<T>())!!
}
