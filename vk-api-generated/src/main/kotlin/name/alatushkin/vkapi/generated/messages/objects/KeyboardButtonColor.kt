package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class KeyboardButtonColor(@JsonValue val jsonValue: String) {
    DEFAULT("default"),
    POSITIVE("positive"),
    NEGATIVE("negative"),
    PRIMARY("primary");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): KeyboardButtonColor =
            KeyboardButtonColor.values().find { it.jsonValue == value }!!
    }
}
