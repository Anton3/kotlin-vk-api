@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.removeUser]
 *
 * Removes a user from the community.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
data class GroupsRemoveUser(
    var groupId: Int,
    var userId: Int
) : VkMethod<OkResponse>("groups.removeUser", jacksonTypeRef()),
    UserMethod
