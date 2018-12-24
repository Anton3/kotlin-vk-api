package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class OnlineStatusType(@JsonValue override val value: String) : Value<String> {
    NONE("none"),
    ONLINE("online"),
    ANSWER_MARK("answer_mark");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): OnlineStatusType = parseEnum(value)
    }
}
