package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetNearbyRadius(@JsonValue override val value: String) : Value<String> {
    ANY("0"),
    M_300("1"),
    M_2400("2"),
    KM_18("3"),
    _150_KM_("4");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetNearbyRadius = parseEnum(value)
    }
}
