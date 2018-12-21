@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.groups.objects.GetMembersSort
import name.anton3.vkapi.generated.groups.objects.MemberRole
import name.anton3.vkapi.tokens.UserGroupServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getMembers]
 *
 * Returns a list of community members.
 *
 * @property groupId ID or screen name of the community.
 * @property sort Sort order. Available values: 'id_asc', 'id_desc', 'time_asc', 'time_desc'. 'time_asc' and 'time_desc' are availavle only if the method is called by the group's 'moderator'.
 * @property offset Offset needed to return a specific subset of community members.
 * @property count Number of community members to return.
 */
data class GroupsGetMembersManagers(
    var groupId: String? = null,
    var sort: GetMembersSort? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<MemberRole>>("groups.getMembers", jacksonTypeRef()),
    UserGroupServiceMethod {
    init {
        unsafeParam("filter", "managers")
    }
}
