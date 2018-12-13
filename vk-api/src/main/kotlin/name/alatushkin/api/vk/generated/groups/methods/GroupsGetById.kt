@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.getById]
 *
 * Returns information about communities by their IDs.
 *
 * @property groupIds IDs or screen names of communities.
 * @property groupId ID or screen name of the community.
 * @property fields Group fields to return.
 */
data class GroupsGetById(
    var groupIds: List<String>? = null,
    var groupId: String? = null,
    var fields: List<String>? = null
) : VkMethod<List<GroupFull>>(
    "groups.getById",
    jacksonTypeRef()
), UserGroupServiceMethod
