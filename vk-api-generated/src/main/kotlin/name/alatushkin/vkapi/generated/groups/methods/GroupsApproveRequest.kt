@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.approveRequest]
 *
 * Allows to approve join request to the community.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
data class GroupsApproveRequest(
    var groupId: Long,
    var userId: Long
) : VkMethod<OkResponse>("groups.approveRequest", jacksonTypeRef()),
    UserMethod
