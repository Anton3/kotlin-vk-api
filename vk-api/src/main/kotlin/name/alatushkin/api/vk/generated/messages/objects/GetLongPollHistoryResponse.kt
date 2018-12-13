package name.alatushkin.api.vk.generated.messages.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.generated.users.objects.UserFull

data class GetLongPollHistoryResponse(
    val history: List<List<Long>>? = null,
    val groups: List<Group>? = null,
    val messages: LongpollMessages? = null,
    val profiles: List<UserFull>? = null,
    val chats: List<Chat>? = null,
    val newPts: Long? = null,
    val more: BoolInt? = null
)
