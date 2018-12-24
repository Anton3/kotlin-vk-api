package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class PushParamsMode(@get:JsonValue val value: String) {
    ON("on"),
    OFF("off"),
    NO_SOUND("no_sound"),
    NO_TEXT("no_text")
}
