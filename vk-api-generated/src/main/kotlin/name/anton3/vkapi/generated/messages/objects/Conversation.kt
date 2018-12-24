package name.anton3.vkapi.generated.messages.objects

/**
 * Object that describes dialog with user or community or group chat
 *
 * @property peer information about location
 * @property inRead ID of the last read incoming message.
 * @property outRead ID of the last read outcoming message.
 * @property unreadCount number of unread messages.
 * @property important true, if the conversation marked as important (only for community messages).
 * @property unanswered true, if the conversation marked as unanswered (only for community messages).
 * @property pushSettings push-notifications settings
 * @property canWrite information whether current user can send message to the conversation
 * @property chatSettings conversation settings
 */
data class Conversation(
    val peer: ConversationPeer,
    val inRead: Long,
    val outRead: Long,
    val unreadCount: Long? = null,
    val important: Boolean? = null,
    val unanswered: Boolean? = null,
    val pushSettings: ConversationPushSettings? = null,
    val canWrite: ConversationCanWrite,
    val chatSettings: ConversationChatSettings? = null
)
