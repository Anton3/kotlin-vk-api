package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class BanInfoReason(@get:JsonValue val value: String) {
    OTHER("0"),
    SPAM("1"),
    VERBAL_ABUSE("2"),
    STRONG_LANGUAGE("3"),
    FLOOD("4")
}
