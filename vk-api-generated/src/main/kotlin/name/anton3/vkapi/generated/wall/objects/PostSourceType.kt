package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class PostSourceType(@JsonValue override val value: String) : Value<String> {
    VK("vk"),
    WIDGET("widget"),
    API("api"),
    RSS("rss"),
    SMS("sms");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): PostSourceType = parseEnum(value)
    }
}
