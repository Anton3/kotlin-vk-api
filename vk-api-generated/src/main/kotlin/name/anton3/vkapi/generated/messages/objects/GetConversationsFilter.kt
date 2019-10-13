@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetConversationsFilter(override val value: String) : ValueEnum<String> {
    ALL("all"),
    BUSINESS_NOTIFY("business_notify"),
    IMPORTANT("important"),
    MESSAGE_REQUEST("message_request"),
    UNANSWERED("unanswered"),
    UNREAD("unread")
}
