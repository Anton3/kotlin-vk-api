package name.alatushkin.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetConversationsFilter(@JsonValue val jsonValue: String) {
    ALL("all"),
    UNREAD("unread"),
    IMPORTANT("important"),
    UNANSWERED("unanswered");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetConversationsFilter =
            GetConversationsFilter.values().find { it.jsonValue == value }!!
    }
}
