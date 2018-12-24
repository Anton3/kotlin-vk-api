package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchRev(@JsonValue override val value: String) : Value<String> {
    NORMAL("0"),
    REVERSE("1");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): SearchRev = parseEnum(value)
    }
}
