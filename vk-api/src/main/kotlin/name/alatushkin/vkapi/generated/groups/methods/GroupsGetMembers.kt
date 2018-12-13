@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.groups.objects.GetMembersFilter
import name.alatushkin.vkapi.generated.groups.objects.GetMembersSort
import name.alatushkin.vkapi.tokens.UserGroupServiceMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getMembers]
 *
 * Returns a list of community members.
 *
 * @property groupId ID or screen name of the community.
 * @property sort Sort order. Available values: 'id_asc', 'id_desc', 'time_asc', 'time_desc'. 'time_asc' and 'time_desc' are availavle only if the method is called by the group's 'moderator'.
 * @property offset Offset needed to return a specific subset of community members.
 * @property count Number of community members to return.
 * @property filter *'friends' – only friends in this community will be returned,, *'unsure' – only those who pressed 'I may attend' will be returned (if it's an event).
 */
data class GroupsGetMembers(
    var groupId: String? = null,
    var sort: GetMembersSort? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var filter: GetMembersFilter? = null
) : VkMethod<VkList<Long>>(
    "groups.getMembers",
    jacksonTypeRef()
), UserGroupServiceMethod
