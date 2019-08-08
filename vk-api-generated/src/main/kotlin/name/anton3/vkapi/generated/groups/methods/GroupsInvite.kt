@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.invite]
 *
 * Allows to invite friends to the community.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
data class GroupsInvite(
    var groupId: Int,
    var userId: Int
) : VkMethod<OkResponse>("groups.invite", jacksonTypeRef()),
    UserMethod
