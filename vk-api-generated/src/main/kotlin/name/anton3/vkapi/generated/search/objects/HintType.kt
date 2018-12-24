package name.anton3.vkapi.generated.search.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class HintType(@get:JsonValue val value: String) {
    GROUP("group"),
    PROFILE("profile")
}
