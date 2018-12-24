package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetHistoryAttachmentsMediaType(@JsonValue override val value: String) : Value<String> {
    PHOTO("photo"),
    VIDEO("video"),
    DOC("doc"),
    AUDIO("audio"),
    LINK("link"),
    MARKET("market"),
    WALL("wall"),
    SHARE("share");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetHistoryAttachmentsMediaType = parseEnum(value)
    }
}
