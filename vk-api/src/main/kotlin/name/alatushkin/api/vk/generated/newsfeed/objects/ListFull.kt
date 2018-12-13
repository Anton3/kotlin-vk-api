package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class ListFull(
    val noReposts: BoolInt? = null,
    val sourceIds: List<Long>? = null,
    override val id: Long,
    override val title: String
) : ListMin
