package name.anton3.vkapi.vktypes

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*

@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
class VkDate(val unixTimeSeconds: Long) {

    fun toDate(): Date = Date(unixTimeSeconds * 1000)

    override fun toString(): String = unixTimeSeconds.toString()
}
