package name.alatushkin.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetAlbumId(@JsonValue val jsonValue: String) {
    PROFILE("profile"),
    WALL("wall"),
    SAVED("saved");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetAlbumId =
            GetAlbumId.values().find { it.jsonValue == value }!!
    }
}
