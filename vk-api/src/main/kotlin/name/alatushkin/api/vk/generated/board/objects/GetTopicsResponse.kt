package name.alatushkin.api.vk.generated.board.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class GetTopicsResponse(
    val count: Long,
    val items: List<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: BoolInt
)
