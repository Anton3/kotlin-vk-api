@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
