package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class Visibility(@get:JsonValue val value: String) {
    OPEN("0"),
    CLOSED("1"),
    PRIVATE("2")
}
