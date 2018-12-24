package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class EditAgeLimits(@get:JsonValue val value: String) {
    UNLIMITED("1"),
    PLUS_16("2"),
    PLUS_18("3")
}
