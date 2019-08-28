@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.generated.common.objects.UserId

/**
 * No description
 *
 * @property count Number of friends has been added
 * @property items No description
 */
data class ItemFriendFriends(
    val count: Int? = null,
    val items: List<UserId>? = null
)
