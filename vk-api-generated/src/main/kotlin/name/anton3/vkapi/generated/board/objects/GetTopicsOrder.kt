package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetTopicsOrder(@JsonValue val jsonValue: String) {
    UPDATED_DESC("1"),
    CREATED_DESC("2"),
    UPDATED_ASC("-1"),
    CREATED_ASC("-2"),
    AS_BY_ADMINISTRATOR("0");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetTopicsOrder =
            GetTopicsOrder.values().find { it.jsonValue == value }!!
    }
}
