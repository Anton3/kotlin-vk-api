package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property items No description
 * @property next New value for _from_ parameter
 * @property name Block name
 * @property id Block ID
 * @property view No description
 * @property canHide Information whether the block can be hidden
 * @property type No description
 */
data class CatBlock(
    val items: List<CatElement>,
    val next: String,
    val name: String,
    val id: Int,
    val view: CatBlockView,
    val canHide: BoolInt,
    val type: CatBlockView? = null
)
