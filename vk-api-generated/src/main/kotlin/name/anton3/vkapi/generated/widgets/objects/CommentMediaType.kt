package name.anton3.vkapi.generated.widgets.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CommentMediaType(@JsonValue override val value: String) : Value<String> {
    AUDIO("audio"),
    PHOTO("photo"),
    VIDEO("video");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): CommentMediaType = parseEnum(value)
    }
}
