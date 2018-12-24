package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class NameRequestStatus(@JsonValue override val value: String) : Value<String> {
    SUCCESS("success"),
    PROCESSING("processing"),
    DECLINED("declined"),
    WAS_ACCEPTED("was_accepted"),
    WAS_DECLINED("was_declined");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): NameRequestStatus = parseEnum(value)
    }
}
