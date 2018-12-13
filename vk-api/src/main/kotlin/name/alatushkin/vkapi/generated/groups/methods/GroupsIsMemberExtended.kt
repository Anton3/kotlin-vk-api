@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.groups.objects.IsMemberExtendedResponse
import name.alatushkin.vkapi.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.isMember]
 *
 * Returns information specifying whether a user is a member of a community.
 *
 * @property groupId ID or screen name of the community.
 * @property userId User ID.
 */
data class GroupsIsMemberExtended(
    var groupId: String,
    var userId: Long? = null
) : VkMethod<IsMemberExtendedResponse>(
    "groups.isMember",
    jacksonTypeRef()
), UserGroupServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
