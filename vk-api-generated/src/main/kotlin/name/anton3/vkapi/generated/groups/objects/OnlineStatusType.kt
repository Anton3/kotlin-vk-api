package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class OnlineStatusType(@JsonValue val jsonValue: String) {
    NONE("none"),
    ONLINE("online"),
    ANSWER_MARK("answer_mark");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): OnlineStatusType =
            OnlineStatusType.values().find { it.jsonValue == value }!!
    }
}
