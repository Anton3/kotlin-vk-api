package name.anton3.vkapi.generated.friends.objects

/**
 * No description
 *
 * @property id User ID
 * @property commonCount Total mutual friends number
 * @property commonFriends No description
 */
data class MutualFriend(
    val id: Long? = null,
    val commonCount: Long? = null,
    val commonFriends: List<Long>? = null
)
