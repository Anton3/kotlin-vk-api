@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.friends.objects.GetOnlineOnlineMobileResponse
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/friends.getOnline]
 *
 * Returns a list of user IDs of a user's friends who are online.
 *
 * @property userId User ID.
 * @property listId Friend list ID. If this parameter is not set, information about all online friends is returned.
 * @property order Sort order: 'random' — random order
 * @property count Number of friends to return.
 * @property offset Offset needed to return a specific subset of friends.
 */
data class FriendsGetOnlineOnlineMobile(
    var userId: Int? = null,
    var listId: Int? = null,
    var order: String? = null,
    var count: Int? = null,
    var offset: Int? = null
) : VkMethod<GetOnlineOnlineMobileResponse>("friends.getOnline", jacksonTypeRef()),
    UserMethod {
    init {
        unsafeParam("online_mobile", "1")
    }
}
