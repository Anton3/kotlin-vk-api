package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetHistoryRev(@get:JsonValue val value: String) {
    CHRONOLOGICAL("1"),
    REVERSE_CHRONOLOGICAL("0")
}
