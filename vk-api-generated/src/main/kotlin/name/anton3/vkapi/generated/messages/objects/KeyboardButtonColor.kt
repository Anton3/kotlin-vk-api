package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class KeyboardButtonColor(@get:JsonValue val value: String) {
    DEFAULT("default"),
    POSITIVE("positive"),
    NEGATIVE("negative"),
    PRIMARY("primary")
}
