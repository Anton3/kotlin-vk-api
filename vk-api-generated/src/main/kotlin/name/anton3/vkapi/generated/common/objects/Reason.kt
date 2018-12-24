package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class Reason(@JsonValue override val value: String) : Value<String> {
    SPAM("0"),
    CHILD_PORNOGRAPHY("1"),
    EXTREMISM("2"),
    VIOLENCE("3"),
    DRUG_PROPAGANDA("4"),
    ADULT_MATERIAL("5"),
    INSULT_ABUSE("6");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): Reason = parseEnum(value)
    }
}
