package name.anton3.vkapi.generated.pages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class Access(@get:JsonValue val value: String) {
    MANAGERS("0"),
    MEMBERS("1"),
    ALL("2")
}
