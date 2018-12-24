package name.anton3.vkapi.generated.gifts.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GiftPrivacy(@get:JsonValue val value: String) {
    NAME_AND_MESSAGE_FOR_ALL("0"),
    NAME_FOR_ALL("1"),
    NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY("2")
}
