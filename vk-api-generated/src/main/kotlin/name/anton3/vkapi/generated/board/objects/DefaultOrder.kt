package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class DefaultOrder(@get:JsonValue val value: String) {
    DESC_UPDATED("1"),
    DESC_CREATED("2"),
    ASC_UPDATED("-1"),
    ASC_CREATED("-2")
}
