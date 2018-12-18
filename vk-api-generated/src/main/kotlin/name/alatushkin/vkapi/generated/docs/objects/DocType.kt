package name.anton3.vkapi.generated.docs.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class DocType(@JsonValue val jsonValue: String) {
    TEXT("1"),
    ARCH("2"),
    GIF("3"),
    IMAGE("4"),
    AUDIO("5"),
    VIDEO("6"),
    EBOOK("7"),
    UNKNOWN("8");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): DocType =
            DocType.values().find { it.jsonValue == value }!!
    }
}
