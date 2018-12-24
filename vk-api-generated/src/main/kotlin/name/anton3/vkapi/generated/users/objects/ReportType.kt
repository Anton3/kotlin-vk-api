package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ReportType(@JsonValue override val value: String) : Value<String> {
    PORN("porn"),
    SPAM("spam"),
    INSULT("insult"),
    ADVERTISMENT("advertisment");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): ReportType = parseEnum(value)
    }
}
