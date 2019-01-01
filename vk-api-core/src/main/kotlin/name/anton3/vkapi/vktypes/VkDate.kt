package name.anton3.vkapi.vktypes

import java.util.*

class VkDate(date: Long) {
    private val date: Date = Date(date * 1000)

    fun toDate(): Date = date

    override fun toString(): String = (date.time / 1000).toString()
}
