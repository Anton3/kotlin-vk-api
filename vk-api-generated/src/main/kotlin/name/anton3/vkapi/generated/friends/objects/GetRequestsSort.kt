package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetRequestsSort(@JsonValue override val value: String) : Value<String> {
    DATE("0"),
    MUTUAL("1");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetRequestsSort = parseEnum(value)
    }
}
