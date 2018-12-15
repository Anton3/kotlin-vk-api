@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.removeUser]
 *
 * Removes a user from the community.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
data class GroupsRemoveUser(
    var groupId: Long,
    var userId: Long
) : VkMethod<OkResponse>("groups.removeUser", jacksonTypeRef()),
    UserMethod
