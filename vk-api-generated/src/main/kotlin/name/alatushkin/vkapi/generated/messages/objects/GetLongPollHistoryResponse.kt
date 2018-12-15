package name.alatushkin.vkapi.generated.messages.objects

import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property history No description
 * @property groups No description
 * @property messages No description
 * @property profiles No description
 * @property chats No description
 * @property newPts Persistence timestamp
 * @property more Has more
 */
data class GetLongPollHistoryResponse(
    val history: List<List<Long>>? = null,
    val groups: List<Group>? = null,
    val messages: LongpollMessages? = null,
    val profiles: List<UserFull>? = null,
    val chats: List<Chat>? = null,
    val newPts: Long? = null,
    val more: Boolean? = null
)
