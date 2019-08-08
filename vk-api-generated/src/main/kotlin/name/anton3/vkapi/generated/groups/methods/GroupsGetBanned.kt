@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.groups.objects.OwnerXtrBanInfo
import name.anton3.vkapi.method.UserMethod
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
 * @property userId No description
 */
data class GroupsGetBanned(
    var groupId: Int,
    var offset: Int? = null,
    var count: Int? = null,
    var fields: List<String>? = null,
    var userId: Int? = null
) : VkMethod<VkList<OwnerXtrBanInfo>>("groups.getBanned", jacksonTypeRef()),
    UserMethod
