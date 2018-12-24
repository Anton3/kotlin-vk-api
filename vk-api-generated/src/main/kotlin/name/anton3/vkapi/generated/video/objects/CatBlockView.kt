package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CatBlockView(@get:JsonValue val value: String) {
    HORIZONTAL("horizontal"),
    HORIZONTAL_COMPACT("horizontal_compact"),
    VERTICAL("vertical"),
    VERTICAL_COMPACT("vertical_compact")
}
