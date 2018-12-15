package name.alatushkin.vkapi.generated.video.objects

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
    val id: Long,
    val view: CatBlockView,
    val canHide: Boolean,
    val type: CatBlockView? = null
)
