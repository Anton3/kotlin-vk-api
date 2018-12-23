package name.anton3.vkapi.generated.messages.objects

/**
 * information whether current user can send message to the conversation
 *
 * @property allowed true, if the user can send message to the conversation
 * @property reason error code for allowed = false
 */
data class ConversationCanWrite(
    val allowed: Boolean,
    val reason: ConversationCanWriteReason? = null
)
