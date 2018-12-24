package name.anton3.vkapi.generated.likes.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetListFilter(@get:JsonValue val value: String) {
    LIKES("likes"),
    COPIES("copies")
}
