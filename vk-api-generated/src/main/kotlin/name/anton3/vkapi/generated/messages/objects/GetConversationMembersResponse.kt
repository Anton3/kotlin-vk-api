package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Number of conversation members
 * @property items Conversation members
 * @property profiles User member profiles
 * @property groups Group member profiles
 */
data class GetConversationMembersResponse(
    val count: Int,
    val items: List<ConversationMember>,
    val profiles: List<User>? = null,
    val groups: List<Group>? = null
)
