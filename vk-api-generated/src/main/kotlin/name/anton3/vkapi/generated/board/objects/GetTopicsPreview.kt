package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetTopicsPreview(@get:JsonValue val value: String) {
    FIRST("1"),
    LAST("2"),
    NONE("0")
}
