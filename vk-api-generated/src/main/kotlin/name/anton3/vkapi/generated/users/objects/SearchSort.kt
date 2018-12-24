package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class SearchSort(@get:JsonValue val value: String) {
    BY_RATING("0"),
    BY_DATE_REGISTERED("1")
}
