package name.anton3.vkapi.generated.gifts.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GiftPrivacy(@JsonValue override val value: String) : Value<String> {
    NAME_AND_MESSAGE_FOR_ALL("0"),
    NAME_FOR_ALL("1"),
    NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY("2");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GiftPrivacy = parseEnum(value)
    }
}
