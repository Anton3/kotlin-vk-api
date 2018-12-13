package name.alatushkin.api.vk.generated.board.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.users.objects.UserMin

data class GetTopicsExtendedResponse(
    val count: Long,
    val items: List<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: BoolInt,
    val profiles: List<UserMin>
)
