package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.users.objects.UserMin

data class GetTopicsExtendedResponse(
    val count: Long,
    val items: List<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: BoolInt,
    val profiles: List<UserMin>
)
