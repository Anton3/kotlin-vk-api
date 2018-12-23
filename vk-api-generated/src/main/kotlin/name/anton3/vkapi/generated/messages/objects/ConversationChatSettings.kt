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
 */
data class ConversationChatSettings(
    val memberCount: Long,
    val title: Long,
    val pinnedMessage: PinnedMessage? = null,
    val state: ConversationChatSettingsState,
    val photo: ConversationChatSettingsPhoto,
    val activeIds: List<Long>,
    val isGroupChannel: Boolean
)
