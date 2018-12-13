package name.alatushkin.vkapi.generated.messages.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.UserFull

data class GetLongPollHistoryResponse(
    val history: List<List<Long>>? = null,
    val groups: List<Group>? = null,
    val messages: LongpollMessages? = null,
    val profiles: List<UserFull>? = null,
    val chats: List<Chat>? = null,
    val newPts: Long? = null,
    val more: BoolInt? = null
)
