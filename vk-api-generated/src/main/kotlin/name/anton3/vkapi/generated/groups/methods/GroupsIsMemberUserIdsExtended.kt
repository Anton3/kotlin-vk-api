@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.IsMemberExtendedResponse
import name.anton3.vkapi.method.UserGroupServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.isMember]
 *
 * Returns information specifying whether a user is a member of a community.
 *
 * @property groupId ID or screen name of the community.
 * @property userId User ID.
 */
data class GroupsIsMemberUserIdsExtended(
    var groupId: String,
    var userId: Int? = null
) : VkMethod<IsMemberExtendedResponse, UserGroupServiceMethod>("groups.isMember", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
