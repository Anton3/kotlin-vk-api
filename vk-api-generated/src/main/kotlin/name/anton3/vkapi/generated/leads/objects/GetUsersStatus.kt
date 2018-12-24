package name.anton3.vkapi.generated.leads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetUsersStatus(@JsonValue override val value: String) : Value<String> {
    START("0"),
    FINISH("1"),
    BLOCKING_USERS("2"),
    START_IN_TEST_MODE("3"),
    FINISH_IN_TEST_MODE("4");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetUsersStatus = parseEnum(value)
    }
}
