package name.anton3.vkapi.vktypes

import com.fasterxml.jackson.annotation.JsonValue
import java.util.*

class VkDate(@JsonValue private val unixTimeSeconds: Long) {

    fun toDate(): Date = Date(unixTimeSeconds * 1000)

    override fun toString(): String = unixTimeSeconds.toString()
}
