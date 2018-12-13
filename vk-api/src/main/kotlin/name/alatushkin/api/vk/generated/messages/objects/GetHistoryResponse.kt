package name.alatushkin.api.vk.generated.messages.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull

data class GetHistoryResponse(
    val count: Long,
    val items: List<Message>,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null
)
