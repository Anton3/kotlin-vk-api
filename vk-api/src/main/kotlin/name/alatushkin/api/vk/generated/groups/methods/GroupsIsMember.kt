@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.isMember]
 *
 * Returns information specifying whether a user is a member of a community.
 *
 * @property groupId ID or screen name of the community.
 * @property userId User ID.
 */
data class GroupsIsMember(
    var groupId: String,
    var userId: Long? = null
) : VkMethod<BoolInt>(
    "groups.isMember",
    jacksonTypeRef()
), UserGroupServiceMethod
