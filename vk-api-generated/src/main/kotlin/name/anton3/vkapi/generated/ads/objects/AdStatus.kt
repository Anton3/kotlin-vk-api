package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class AdStatus(@JsonValue override val value: String) : Value<String> {
    STOPPED("0"),
    STARTED("1"),
    DELETED("2");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): AdStatus = parseEnum(value)
    }
}
