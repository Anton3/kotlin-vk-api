package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ItemWallpostType(@JsonValue override val value: String) : Value<String> {
    POST("post"),
    COPY("copy"),
    REPLY("reply");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): ItemWallpostType = parseEnum(value)
    }
}
