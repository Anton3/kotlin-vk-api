package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetRequestsSort(@JsonValue override val value: Int) : Value<Int> {
    DATE(0),
    MUTUAL(1);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): GetRequestsSort = parseEnum(value)
    }
}
