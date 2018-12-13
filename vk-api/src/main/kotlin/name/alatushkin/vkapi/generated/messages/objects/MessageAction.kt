package name.alatushkin.vkapi.generated.messages.objects

data class MessageAction(
    val type: MessageActionStatus,
    val memberId: Long? = null,
    val message: String? = null,
    val text: String? = null,
    val conversationMessageId: Long? = null,
    val email: String? = null
)
