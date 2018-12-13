package name.alatushkin.api.vk.generated.video.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class CatBlock(
    val items: List<CatElement>,
    val next: String,
    val name: String,
    val id: Long,
    val view: CatBlockView,
    val canHide: BoolInt,
    val type: CatBlockView? = null
)
