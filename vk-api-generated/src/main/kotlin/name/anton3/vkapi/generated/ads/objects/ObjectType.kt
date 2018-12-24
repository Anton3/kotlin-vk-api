package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ObjectType(@JsonValue override val value: String) : Value<String> {
    AD("ad"),
    CAMPAIGN("campaign"),
    CLIENT("client"),
    OFFICE("office");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): ObjectType = parseEnum(value)
    }
}
