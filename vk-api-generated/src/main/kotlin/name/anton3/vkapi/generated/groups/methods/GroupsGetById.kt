@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupServiceMethod

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
) : CheckedMethod<List<GroupFull>, UserGroupServiceMethod>("groups.getById", jacksonTypeRef())
