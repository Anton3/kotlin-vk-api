package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class Type(@JsonValue override val value: String) : Value<String> {
    AD("ad"),
    CAMPAIGN("campaign"),
    CLIENT("client"),
    OFFICE("office");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): Type = parseEnum(value)
    }
}
