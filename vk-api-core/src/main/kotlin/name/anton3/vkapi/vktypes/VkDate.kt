package name.anton3.vkapi.vktypes

import com.fasterxml.jackson.annotation.JsonValue
import java.util.*

class VkDate(@JsonValue private val unixTimeSeconds: Long) : Date(unixTimeSeconds * 1000) {

    override fun equals(other: Any?): Boolean = other is VkDate && unixTimeSeconds == other.unixTimeSeconds
    override fun hashCode(): Int = unixTimeSeconds.hashCode()
    override fun toString(): String = unixTimeSeconds.toString()
}
