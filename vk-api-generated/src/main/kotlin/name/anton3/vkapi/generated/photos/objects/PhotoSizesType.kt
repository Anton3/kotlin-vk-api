package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class PhotoSizesType(@JsonValue override val value: String) : Value<String> {
    S("s"),
    M("m"),
    X("x"),
    O("o"),
    P("p"),
    Q("q"),
    R("r"),
    Y("y"),
    Z("z"),
    W("w");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): PhotoSizesType = parseEnum(value)
    }
}
