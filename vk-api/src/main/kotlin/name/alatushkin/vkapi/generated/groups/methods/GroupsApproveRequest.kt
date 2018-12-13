@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "groups.approveRequest",
    jacksonTypeRef()
), UserMethod
