@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property conversationMessageId Message ID
 * @property email Email address for chat_invite_user or chat_kick_user actions
 * @property memberId User or email peer ID
 * @property message Message body of related message
 * @property photo No description
 * @property text New chat title for chat_create and chat_title_update actions
 * @property type No description
 */
data class MessageAction(
    val conversationMessageId: Int? = null,
    val email: String? = null,
    val memberId: Int? = null,
    val message: String? = null,
    val photo: MessageActionPhoto? = null,
    val text: String? = null,
    val type: MessageActionStatus
)
