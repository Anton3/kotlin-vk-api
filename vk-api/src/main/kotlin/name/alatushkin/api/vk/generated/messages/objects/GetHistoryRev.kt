package name.alatushkin.api.vk.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetHistoryRev(@JsonValue val jsonValue: String) {
    CHRONOLOGICAL("1"),
    REVERSE_CHRONOLOGICAL("0");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetHistoryRev =
            GetHistoryRev.values().find { it.jsonValue == value }!!
    }
}
