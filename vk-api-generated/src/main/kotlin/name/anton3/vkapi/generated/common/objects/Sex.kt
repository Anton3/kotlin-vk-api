package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class Sex(@get:JsonValue val value: String) {
    UNKNOWN("0"),
    FEMALE("1"),
    MALE("2")
}
