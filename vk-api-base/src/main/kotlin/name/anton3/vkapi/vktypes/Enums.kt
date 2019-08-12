package name.anton3.vkapi.vktypes

import java.io.IOException

interface Value<T> {
    val value: T
}

inline fun <reified E, reified T> parseEnum(value: T): E where E : Enum<E>, E : Value<T> {
    return enumValues<E>().find { it.value == value }
        ?: throw IOException("Could not parse enum ${E::class.simpleName} from $value")
}
