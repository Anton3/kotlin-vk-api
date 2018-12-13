package name.alatushkin.vkapi.generated.messages.objects

import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.User

data class GetConversationMembersResponse(
    val count: Long,
    val items: List<ConversationMember>,
    val profiles: List<User>,
    val groups: List<Group>
)
