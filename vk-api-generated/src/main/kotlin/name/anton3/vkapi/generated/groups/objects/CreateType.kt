package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CreateType(@get:JsonValue val value: String) {
    GROUP("group"),
    PUBLIC("public"),
    EVENT("event")
}
