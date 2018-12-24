package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class BanUserReason(@get:JsonValue val value: String) {
    OTHER("0"),
    SPAM("1"),
    VERBAL_ABUSE("2"),
    STRONG_LANGUAGE("3"),
    IRRELEVANT_MESSAGES("4")
}
