package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class PostType(@JsonValue override val value: String) : Value<String> {
    POST("post"),
    COPY("copy"),
    REPLY("reply"),
    POSTPONE("postpone"),
    SUGGEST("suggest");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): PostType = parseEnum(value)
    }
}
