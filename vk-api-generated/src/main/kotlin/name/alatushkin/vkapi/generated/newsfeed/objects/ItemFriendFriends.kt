package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.common.objects.UserId

/**
 * No description
 *
 * @property count Number of friends has been added
 * @property items No description
 */
data class ItemFriendFriends(
    val count: Long? = null,
    val items: List<UserId>? = null
)
