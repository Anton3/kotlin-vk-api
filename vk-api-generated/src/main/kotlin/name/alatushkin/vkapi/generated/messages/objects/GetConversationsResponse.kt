package name.alatushkin.vkapi.generated.messages.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property count Total number
 * @property unreadCount Unread dialogs number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetConversationsResponse(
    val count: Long,
    val unreadCount: Long? = null,
    val items: List<ConversationWithMessage>,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null
)
