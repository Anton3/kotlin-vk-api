package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetAlbumId(@JsonValue override val value: String) : Value<String> {
    PROFILE("profile"),
    WALL("wall"),
    SAVED("saved");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetAlbumId = parseEnum(value)
    }
}
