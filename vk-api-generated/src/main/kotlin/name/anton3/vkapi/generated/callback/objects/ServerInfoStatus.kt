package name.anton3.vkapi.generated.callback.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ServerInfoStatus(@JsonValue override val value: String) : Value<String> {
    UNCONFIGURED("unconfigured"),
    FAIL("fail"),
    WAIT("wait"),
    OK("ok");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): ServerInfoStatus = parseEnum(value)
    }
}
