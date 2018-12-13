package name.alatushkin.api.vk.generated.board.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetTopicsPreview(@JsonValue val jsonValue: String) {
    FIRST("1"),
    LAST("2"),
    NONE("0");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetTopicsPreview =
            GetTopicsPreview.values().find { it.jsonValue == value }!!
    }
}
