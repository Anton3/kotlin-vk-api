package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class EditWall(@get:JsonValue val value: String) {
    DISABLED("0"),
    OPEN("1"),
    LIMITED("2"),
    CLOSED("3")
}
