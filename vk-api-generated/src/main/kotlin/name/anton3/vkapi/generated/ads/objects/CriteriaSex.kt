package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CriteriaSex(@JsonValue override val value: String) : Value<String> {
    ANY("0"),
    MALE("1"),
    FEMALE("2");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): CriteriaSex = parseEnum(value)
    }
}
