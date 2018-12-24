package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class UnsubscribeType(@JsonValue override val value: String) : Value<String> {
    NOTE("note"),
    PHOTO("photo"),
    POST("post"),
    TOPIC("topic"),
    VIDEO("video");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): UnsubscribeType = parseEnum(value)
    }
}
