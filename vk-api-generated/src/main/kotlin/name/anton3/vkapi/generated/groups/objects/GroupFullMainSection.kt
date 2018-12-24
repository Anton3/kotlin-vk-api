package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GroupFullMainSection(@JsonValue override val value: String) : Value<String> {
    ABSENT("0"),
    PHOTOS("1"),
    TOPICS("2"),
    AUDIO("3"),
    VIDEO("4"),
    MARKET("5");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GroupFullMainSection = parseEnum(value)
    }
}
