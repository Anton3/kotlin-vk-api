package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CatElementType(@JsonValue override val value: String) : Value<String> {
    VIDEO("video"),
    ALBUM("album");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): CatElementType = parseEnum(value)
    }
}
