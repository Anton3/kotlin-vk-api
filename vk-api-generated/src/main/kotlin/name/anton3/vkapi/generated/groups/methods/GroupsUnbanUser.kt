@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.unbanUser]
 *
 * Removes a user from a community blacklist.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
data class GroupsUnbanUser(
    var groupId: Int,
    var userId: Int
) : VkMethod<OkResponse>("groups.unbanUser", jacksonTypeRef()),
    UserMethod
