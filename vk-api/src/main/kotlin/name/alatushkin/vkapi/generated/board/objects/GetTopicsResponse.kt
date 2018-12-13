package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class GetTopicsResponse(
    val count: Long,
    val items: List<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: BoolInt
)
