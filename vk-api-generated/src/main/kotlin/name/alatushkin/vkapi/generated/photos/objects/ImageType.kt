package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class ImageType(@JsonValue val jsonValue: String) {
    S("s"),
    M("m"),
    X("x"),
    O("o"),
    P("p"),
    Q("q"),
    R("r"),
    Y("y"),
    Z("z"),
    W("w"),
    K("k");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ImageType =
            ImageType.values().find { it.jsonValue == value }!!
    }
}
