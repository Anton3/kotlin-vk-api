@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property id Category ID
 * @property name Category name
 * @property pageCount Pages number
 * @property pagePreviews No description
 * @property subcategories No description
 */
data class GroupCategoryFull(
    val id: Int,
    val name: String,
    val pageCount: Int,
    val pagePreviews: List<Group>,
    val subcategories: List<GroupCategory>? = null
)
