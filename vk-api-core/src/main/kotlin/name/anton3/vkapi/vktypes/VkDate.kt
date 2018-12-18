package name.anton3.vkapi.vktypes

import java.util.*

class VkDate(date: Long) : Date(date) {
    override fun toString(): String {
        return (time / 1000).toString()
    }
}
