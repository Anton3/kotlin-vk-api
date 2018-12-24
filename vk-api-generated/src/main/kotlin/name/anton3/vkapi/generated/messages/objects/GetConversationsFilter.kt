package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetConversationsFilter(@JsonValue override val value: String) : Value<String> {
    ALL("all"),
    UNREAD("unread"),
    IMPORTANT("important"),
    UNANSWERED("unanswered");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetConversationsFilter = parseEnum(value)
    }
}
