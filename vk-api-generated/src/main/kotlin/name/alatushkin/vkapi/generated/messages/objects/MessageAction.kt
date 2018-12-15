package name.alatushkin.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property type No description
 * @property memberId User or email peer ID
 * @property message Message body of related message
 * @property text New chat title for chat_create and chat_title_update actions
 * @property conversationMessageId Message ID
 * @property email Email address for chat_invite_user or chat_kick_user actions
 */
data class MessageAction(
    val type: MessageActionStatus,
    val memberId: Long? = null,
    val message: String? = null,
    val text: String? = null,
    val conversationMessageId: Long? = null,
    val email: String? = null
)
