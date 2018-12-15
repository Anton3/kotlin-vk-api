package name.alatushkin.vkapi.generated.friends.objects

/**
 * No description
 *
 * @property count Total requests number
 * @property items No description
 * @property countUnread Total unread requests number
 */
data class GetRequestsResponse(
    val count: Long? = null,
    val items: List<Long>? = null,
    val countUnread: Long? = null
)
