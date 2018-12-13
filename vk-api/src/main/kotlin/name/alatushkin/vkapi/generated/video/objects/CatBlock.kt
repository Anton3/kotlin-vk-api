package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class CatBlock(
    val items: List<CatElement>,
    val next: String,
    val name: String,
    val id: Long,
    val view: CatBlockView,
    val canHide: BoolInt,
    val type: CatBlockView? = null
)
