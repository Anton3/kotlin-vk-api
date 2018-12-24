package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class SearchSort(@get:JsonValue val value: String) {
    DURATION("1"),
    RELEVANCE("2"),
    DATE_ADDED("0")
}
