package name.alatushkin.vkapi.vktypes

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.vkapi.json.deser.UnixTimeDeserializer
import java.util.*

@JsonDeserialize(using = UnixTimeDeserializer::class)
class VkDate(date: Long) : Date(date) {
    override fun toString(): String {
        return (time / 1000).toString()
    }
}
