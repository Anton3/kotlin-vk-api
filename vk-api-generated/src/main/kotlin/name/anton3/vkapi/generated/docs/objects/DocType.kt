package name.anton3.vkapi.generated.docs.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class DocType(@JsonValue override val value: Int) : Value<Int> {
    TEXT(1),
    ARCH(2),
    GIF(3),
    IMAGE(4),
    AUDIO(5),
    VIDEO(6),
    EBOOK(7),
    UNKNOWN(8);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): DocType = parseEnum(value)
    }
}
