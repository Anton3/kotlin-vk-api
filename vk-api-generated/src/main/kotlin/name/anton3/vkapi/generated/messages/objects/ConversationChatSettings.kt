package name.anton3.vkapi.generated.messages.objects

/**
 * conversation settings
 *
 * @property memberCount conversation members number
 * @property title conversation title
 * @property pinnedMessage No description
 * @property state current user state
 * @property photo conversation cover image
 * @property activeIds IDs of the last users who wrote to the conversation
 * @property isGroupChannel true, if this conversation is a community channel
 * @property ownerId ID of chat creator, if any
 * @property adminIds IDs of admins of the chat, if any
 */
data class ConversationChatSettings(
    val memberCount: Int,
    val title: String,
    val pinnedMessage: PinnedMessage? = null,
    val state: ConversationChatSettingsState,
    val photo: ConversationChatSettingsPhoto? = null,
    val activeIds: List<Int>? = null,
    val isGroupChannel: Boolean? = null,
    val ownerId: Int? = null,
    val adminIds: List<Int>? = null
)
