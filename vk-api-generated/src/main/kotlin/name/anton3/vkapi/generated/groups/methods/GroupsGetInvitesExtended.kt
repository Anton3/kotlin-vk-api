@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.GetInvitesExtendedResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.getInvites]
 *
 * Returns a list of invitations to join communities and events.
 *
 * @property offset Offset needed to return a specific subset of invitations.
 * @property count Number of invitations to return.
 */
data class GroupsGetInvitesExtended(
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<GetInvitesExtendedResponse, UserMethod>("groups.getInvites", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
