package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetRequestsSort(@JsonValue val jsonValue: String) {
    DATE("0"),
    MUTUAL("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetRequestsSort =
            GetRequestsSort.values().find { it.jsonValue == value }!!
    }
}
