@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.groups.objects.GroupXtrInvitedBy
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getInvites]
 *
 * Returns a list of invitations to join communities and events.
 *
 * @property offset Offset needed to return a specific subset of invitations.
 * @property count Number of invitations to return.
 */
data class GroupsGetInvites(
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<GroupXtrInvitedBy>>("groups.getInvites", jacksonTypeRef()),
    UserMethod
