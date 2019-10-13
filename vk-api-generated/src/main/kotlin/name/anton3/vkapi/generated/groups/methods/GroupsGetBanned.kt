@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UserGroupFields
import name.anton3.vkapi.generated.groups.objects.BannedItem
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getBanned]
 *
 * Returns a list of users on a community blacklist.
 *
 * @property groupId Community ID.
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 * @property fields No description
 * @property ownerId No description
 */
data class GroupsGetBanned(
    var groupId: Int,
    var offset: Int? = null,
    var count: Int? = null,
    var fields: List<UserGroupFields>? = null,
    var ownerId: Int? = null
) : VkMethod<VkList<BannedItem>, UserGroupMethod>("groups.getBanned", jacksonTypeRef())
