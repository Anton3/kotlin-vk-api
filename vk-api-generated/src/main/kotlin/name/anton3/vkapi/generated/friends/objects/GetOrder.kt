package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetOrder(@get:JsonValue val value: String) {
    NAME("name"),
    HINTS("hints")
}
