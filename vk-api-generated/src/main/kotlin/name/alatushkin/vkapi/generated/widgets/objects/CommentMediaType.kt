package name.alatushkin.vkapi.generated.widgets.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class CommentMediaType(@JsonValue val jsonValue: String) {
    AUDIO("audio"),
    PHOTO("photo"),
    VIDEO("video");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CommentMediaType =
            CommentMediaType.values().find { it.jsonValue == value }!!
    }
}
