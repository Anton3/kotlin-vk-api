@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.groups.objects.GetInvitesExtendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getInvites]
 *
 * Returns a list of invitations to join communities and events.
 *
 * @property offset Offset needed to return a specific subset of invitations.
 * @property count Number of invitations to return.
 */
data class GroupsGetInvitesExtended(
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<GetInvitesExtendedResponse>(
    "groups.getInvites",
    jacksonTypeRef()
), UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
