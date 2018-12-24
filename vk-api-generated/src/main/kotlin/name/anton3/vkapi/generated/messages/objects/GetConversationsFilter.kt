package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetConversationsFilter(@get:JsonValue val value: String) {
    ALL("all"),
    UNREAD("unread"),
    IMPORTANT("important"),
    UNANSWERED("unanswered")
}
