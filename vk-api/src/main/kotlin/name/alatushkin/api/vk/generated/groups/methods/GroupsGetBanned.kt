@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.groups.objects.OwnerXtrBanInfo
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getBanned]
 *
 * Returns a list of users on a community blacklist.
 *
 * @property groupId Community ID.
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 * @property fields 
 * @property userId 
 */
data class GroupsGetBanned(
    var groupId: Long,
    var offset: Long? = null,
    var count: Long? = null,
    var fields: List<String>? = null,
    var userId: Long? = null
) : VkMethod<VkList<OwnerXtrBanInfo>>(
    "groups.getBanned",
    jacksonTypeRef()
), UserMethod
