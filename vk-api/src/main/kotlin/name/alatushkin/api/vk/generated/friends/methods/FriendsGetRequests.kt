@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.friends.objects.GetRequestsResponse
import name.alatushkin.api.vk.generated.friends.objects.GetRequestsSort
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getRequests]
 *
 * Returns information about the current user's incoming and outgoing friend requests.
 *
 * @property offset Offset needed to return a specific subset of friend requests.
 * @property count Number of friend requests to return (default 100, maximum 1000).
 * @property out '1' — to return outgoing requests, '0' — to return incoming requests (default)
 * @property sort Sort order: '1' — by number of mutual friends, '0' — by date
 * @property suggested '1' — to return a list of suggested friends, '0' — to return friend requests (default)
 */
data class FriendsGetRequests(
    var offset: Long? = null,
    var count: Long? = null,
    var out: Boolean? = null,
    var sort: GetRequestsSort? = null,
    var suggested: Boolean? = null
) : VkMethod<GetRequestsResponse>(
    "friends.getRequests",
    jacksonTypeRef()
), UserMethod
