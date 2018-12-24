package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class PhotoSizesType(@get:JsonValue val value: String) {
    S("s"),
    M("m"),
    X("x"),
    O("o"),
    P("p"),
    Q("q"),
    R("r"),
    Y("y"),
    Z("z"),
    W("w")
}
