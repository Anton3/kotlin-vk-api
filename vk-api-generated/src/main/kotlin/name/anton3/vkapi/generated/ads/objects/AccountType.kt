package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class AccountType(@JsonValue override val value: String) : Value<String> {
    GENERAL("general"),
    AGENCY("agency");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): AccountType = parseEnum(value)
    }
}
