package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property memberId Member id
 * @property invitedBy User id of the member that invited this member
 * @property joinDate Date when this member entered the conversation
 * @property isAdmin `true` if this member is an admin of the chat
 * @property canKick `true` if current user can kick this member
 */
data class ConversationMember(
    val memberId: Long,
    val invitedBy: Long,
    val joinDate: Long,
    val isAdmin: Boolean,
    val canKick: Boolean
)
