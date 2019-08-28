package name.anton3.vkapi.vktypes

import java.io.IOException

/**
 * This interface should only be implemented by enums
 * Serializers / deserializers are provided
 */
interface ValueEnum<out T> {
    val value: T
}

@Suppress("unused")
inline fun <reified E, reified T> parseEnum(value: T): E where E : Enum<E>, E : ValueEnum<T> {
    return enumValues<E>().find { it.value == value } ?: throw EnumParsingException(E::class.java, value)
}

class EnumParsingException(type: Class<*>, value: Any?) :
    IOException("Could not find case of enum ${type.simpleName} matching value $value")
