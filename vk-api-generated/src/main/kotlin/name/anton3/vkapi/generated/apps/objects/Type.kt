package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class Type(@get:JsonValue val value: String) {
    REQUEST("request"),
    INVITE("invite")
}
