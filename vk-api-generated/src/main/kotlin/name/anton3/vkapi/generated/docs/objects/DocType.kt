package name.anton3.vkapi.generated.docs.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class DocType(@get:JsonValue val value: String) {
    TEXT("1"),
    ARCH("2"),
    GIF("3"),
    IMAGE("4"),
    AUDIO("5"),
    VIDEO("6"),
    EBOOK("7"),
    UNKNOWN("8")
}
