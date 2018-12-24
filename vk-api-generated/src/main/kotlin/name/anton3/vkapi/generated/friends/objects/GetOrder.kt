package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetOrder(@JsonValue override val value: String) : Value<String> {
    NAME("name"),
    HINTS("hints");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetOrder = parseEnum(value)
    }
}
