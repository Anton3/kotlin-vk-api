@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

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
    var groupId: Int,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<Int>, UserMethod>("groups.getRequests", jacksonTypeRef())
