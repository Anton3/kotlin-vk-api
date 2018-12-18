@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.groups.objects.IsMemberExtendedResponse
import name.anton3.vkapi.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.isMember]
 *
 * Returns information specifying whether a user is a member of a community.
 *
 * @property groupId ID or screen name of the community.
 * @property userIds User IDs.
 */
data class GroupsIsMemberUserIdsExtended(
    var groupId: String,
    var userIds: List<Long>? = null
) : VkMethod<IsMemberExtendedResponse>("groups.isMember", jacksonTypeRef()),
    UserGroupServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
