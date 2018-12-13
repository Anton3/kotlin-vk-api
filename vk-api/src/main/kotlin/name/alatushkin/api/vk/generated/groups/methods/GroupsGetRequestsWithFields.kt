@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.users.objects.UserFull
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
 * @property fields Profile fields to return.
 */
data class GroupsGetRequestsWithFields(
    var groupId: Long,
    var offset: Long? = null,
    var count: Long? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<UserFull>>(
    "groups.getRequests",
    jacksonTypeRef()
), UserMethod
