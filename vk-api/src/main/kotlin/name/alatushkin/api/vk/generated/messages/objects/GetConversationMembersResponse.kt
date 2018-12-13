package name.alatushkin.api.vk.generated.messages.objects

import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.generated.users.objects.User

data class GetConversationMembersResponse(
    val count: Long,
    val items: List<ConversationMember>,
    val profiles: List<User>,
    val groups: List<Group>
)
