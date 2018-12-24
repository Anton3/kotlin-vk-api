package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class OnOffOptions(@JsonValue override val value: String) : Value<String> {
    ON("on"),
    OFF("off");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): OnOffOptions = parseEnum(value)
    }
}
