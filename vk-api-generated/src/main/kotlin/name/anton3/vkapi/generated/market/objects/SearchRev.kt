package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class SearchRev(@get:JsonValue val value: String) {
    NORMAL("0"),
    REVERSE("1")
}
