@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.UserFull

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
 * @property conversations No description
 */
data class GetLongPollHistoryResponse(
    val history: List<List<Int>>? = null,
    val groups: List<Group>? = null,
    val messages: LongpollMessages? = null,
    val profiles: List<UserFull>? = null,
    val chats: List<Chat>? = null,
    val newPts: Int? = null,
    val more: Boolean? = null,
    val conversations: List<Conversation>? = null
)
