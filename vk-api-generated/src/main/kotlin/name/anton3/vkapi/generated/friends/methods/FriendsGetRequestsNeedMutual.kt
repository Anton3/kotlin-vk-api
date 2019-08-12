@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.friends.objects.GetRequestsSort
import name.anton3.vkapi.generated.friends.objects.Requests
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

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
data class FriendsGetRequestsNeedMutual(
    var offset: Int? = null,
    var count: Int? = null,
    var out: Boolean? = null,
    var sort: GetRequestsSort? = null,
    var suggested: Boolean? = null
) : VkMethod<VkList<Requests>, UserMethod>("friends.getRequests", jacksonTypeRef()) {
    init {
        unsafeParam("need_mutual", "1")
    }
}
