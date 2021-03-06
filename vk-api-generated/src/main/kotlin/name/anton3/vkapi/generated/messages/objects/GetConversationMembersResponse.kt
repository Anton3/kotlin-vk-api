@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property count Chat members count
 * @property items No description
 * @property chatRestrictions No description
 * @property profiles No description
 * @property groups No description
 */
data class GetConversationMembersResponse(
    val count: Int,
    val items: List<ConversationMember>,
    val chatRestrictions: ChatRestrictions? = null,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null
)
