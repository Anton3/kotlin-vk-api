@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property canKick Is it possible for user to kick this member
 * @property invitedBy No description
 * @property isAdmin No description
 * @property isOwner No description
 * @property isMessageRequest No description
 * @property joinDate No description
 * @property requestDate Message request date
 * @property memberId No description
 */
data class ConversationMember(
    val canKick: Boolean? = null,
    val invitedBy: Int? = null,
    val isAdmin: Boolean? = null,
    val isOwner: Boolean? = null,
    val isMessageRequest: Boolean? = null,
    val joinDate: Int? = null,
    val requestDate: Int? = null,
    val memberId: Int
)
