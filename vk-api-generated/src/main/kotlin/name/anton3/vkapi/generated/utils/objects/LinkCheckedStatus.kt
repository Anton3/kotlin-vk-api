package name.anton3.vkapi.generated.utils.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class LinkCheckedStatus(@JsonValue override val value: String) : Value<String> {
    NOT_BANNED("not_banned"),
    BANNED("banned"),
    PROCESSING("processing");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): LinkCheckedStatus = parseEnum(value)
    }
}
