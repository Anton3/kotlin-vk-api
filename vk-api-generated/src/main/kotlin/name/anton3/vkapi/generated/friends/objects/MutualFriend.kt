@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

/**
 * No description
 *
 * @property commonCount Total mutual friends number
 * @property commonFriends No description
 * @property id User ID
 */
data class MutualFriend(
    val commonCount: Int? = null,
    val commonFriends: List<Int>? = null,
    val id: Int? = null
)
