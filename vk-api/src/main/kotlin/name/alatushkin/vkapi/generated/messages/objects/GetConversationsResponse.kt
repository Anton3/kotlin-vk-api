package name.alatushkin.vkapi.generated.messages.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

data class GetConversationsResponse(
    val count: Long,
    val unreadCount: Long? = null,
    val items: List<ConversationWithMessage>,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null
)
