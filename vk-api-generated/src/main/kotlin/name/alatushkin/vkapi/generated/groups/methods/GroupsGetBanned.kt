@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.groups.objects.OwnerXtrBanInfo
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
    var groupId: Long,
    var offset: Long? = null,
    var count: Long? = null,
    var fields: List<String>? = null,
    var userId: Long? = null
) : VkMethod<VkList<OwnerXtrBanInfo>>("groups.getBanned", jacksonTypeRef()),
    UserMethod
