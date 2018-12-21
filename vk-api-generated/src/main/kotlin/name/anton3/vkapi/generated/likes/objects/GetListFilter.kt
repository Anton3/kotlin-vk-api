package name.anton3.vkapi.generated.likes.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetListFilter(@JsonValue val jsonValue: String) {
    LIKES("likes"),
    COPIES("copies");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetListFilter =
            GetListFilter.values().find { it.jsonValue == value }!!
    }
}
