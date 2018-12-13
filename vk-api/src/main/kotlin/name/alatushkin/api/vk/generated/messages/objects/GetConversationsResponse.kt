package name.alatushkin.api.vk.generated.messages.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull

data class GetConversationsResponse(
    val count: Long,
    val unreadCount: Long? = null,
    val items: List<ConversationWithMessage>,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null
)
