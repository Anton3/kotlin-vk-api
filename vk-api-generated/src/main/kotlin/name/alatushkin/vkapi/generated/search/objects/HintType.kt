package name.anton3.vkapi.generated.search.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class HintType(@JsonValue val jsonValue: String) {
    GROUP("group"),
    PROFILE("profile");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): HintType =
            HintType.values().find { it.jsonValue == value }!!
    }
}
