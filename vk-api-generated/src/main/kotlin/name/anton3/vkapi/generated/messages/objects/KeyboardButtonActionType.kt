package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class KeyboardButtonActionType(@get:JsonValue val value: String) {
    TEXT("text"),
    START("start")
}
