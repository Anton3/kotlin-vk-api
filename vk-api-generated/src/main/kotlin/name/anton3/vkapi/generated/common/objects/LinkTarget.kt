package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class LinkTarget(@get:JsonValue val value: String) {
    INTERNAL("internal"),
    EXTERNAL("external"),
    OTHER("other")
}
