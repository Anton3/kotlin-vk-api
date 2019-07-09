package name.anton3.vkapi.json.attributes

import com.fasterxml.jackson.databind.DatabindContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.ObjectReader
import com.fasterxml.jackson.databind.ObjectWriter
import com.fasterxml.jackson.databind.cfg.ContextAttributes

class ForwardableAttributes {
    val map: Map<Any, Any>

    constructor(key: Any, value: Any) {
        this.map = mapOf(key to value)
    }

    constructor(map: Map<Any, Any>) {
        this.map = map.toMap()
    }

    operator fun get(key: Any): Any? {
        return map[key]
    }

    fun setting(key: String, value: Any): ForwardableAttributes {
        return ForwardableAttributes(map.toMutableMap().also { it[key] = value })
    }

    fun merging(other: Map<String, Any>): ForwardableAttributes {
        return ForwardableAttributes(map + other)
    }

    fun removing(key: String): ForwardableAttributes {
        return ForwardableAttributes(map.toMutableMap().also { it.remove(key) })
    }

    companion object {
        val EMPTY: ForwardableAttributes = ForwardableAttributes(emptyMap())
    }
}

val DatabindContext.forwardableAttributes: ForwardableAttributes
    get() = getAttribute(UNIVERSAL_ATTRIBUTE_NAME) as? ForwardableAttributes ?: ForwardableAttributes.EMPTY

fun ObjectMapper.reader(attributes: ForwardableAttributes): ObjectReader {
    return reader(attributes.toAttributes())
}

fun ObjectMapper.writer(attributes: ForwardableAttributes): ObjectWriter {
    return writer(attributes.toAttributes())
}


private val UNIVERSAL_ATTRIBUTE_NAME = ForwardableAttributes::class.simpleName!!

internal fun ForwardableAttributes.toAttributes(): ContextAttributes {
    return ContextAttributes.getEmpty().withPerCallAttribute(UNIVERSAL_ATTRIBUTE_NAME, this)
}
