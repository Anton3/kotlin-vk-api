package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class ListFull(
    val noReposts: BoolInt? = null,
    val sourceIds: List<Long>? = null,
    override val id: Long,
    override val title: String
) : ListMin
