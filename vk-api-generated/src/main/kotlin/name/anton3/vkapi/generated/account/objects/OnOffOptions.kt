package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class OnOffOptions(@JsonValue val jsonValue: String) {
    ON("on"),
    OFF("off");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): OnOffOptions =
            OnOffOptions.values().find { it.jsonValue == value }!!
    }
}
