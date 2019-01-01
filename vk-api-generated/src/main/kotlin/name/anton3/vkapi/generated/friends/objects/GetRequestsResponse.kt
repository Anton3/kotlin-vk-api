package name.anton3.vkapi.generated.friends.objects

/**
 * No description
 *
 * @property count Total requests number
 * @property items No description
 * @property countUnread Total unread requests number
 */
data class GetRequestsResponse(
    val count: Int? = null,
    val items: List<Int>? = null,
    val countUnread: Int? = null
)
