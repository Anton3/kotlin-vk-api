package name.alatushkin.vkapi.generated.messages.objects

data class ConversationMember(
    val memberId: Long,
    val invitedBy: Long,
    val joinDate: Long,
    val isAdmin: Boolean,
    val canKick: Boolean
)
