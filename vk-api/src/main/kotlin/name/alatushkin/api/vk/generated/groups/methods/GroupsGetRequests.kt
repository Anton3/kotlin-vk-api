@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getRequests]
 *
 * Returns a list of requests to the community.
 *
 * @property groupId Community ID.
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of results to return.
 */
data class GroupsGetRequests(
    var groupId: Long,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Long>>(
    "groups.getRequests",
    jacksonTypeRef()
), UserMethod
