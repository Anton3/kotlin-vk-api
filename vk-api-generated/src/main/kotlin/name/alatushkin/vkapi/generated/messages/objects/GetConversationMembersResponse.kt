package name.alatushkin.vkapi.generated.messages.objects

import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Number of conversation members
 * @property items Conversation members
 * @property profiles User member profiles
 * @property groups Group member profiles
 */
data class GetConversationMembersResponse(
    val count: Long,
    val items: List<ConversationMember>,
    val profiles: List<User>,
    val groups: List<Group>
)
