package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class SearchSort(@get:JsonValue val value: String) {
    DEFAULT("0"),
    GROWTH("1"),
    ATTENDANCE("2"),
    LIKES("3"),
    COMMENTS("4"),
    ENTRIES("5")
}
