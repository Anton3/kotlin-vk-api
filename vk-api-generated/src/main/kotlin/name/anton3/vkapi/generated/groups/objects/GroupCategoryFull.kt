package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property id Category ID
 * @property name Category name
 * @property subcategories No description
 * @property pageCount Pages number
 * @property pagePreviews No description
 */
data class GroupCategoryFull(
    val id: Int,
    val name: String,
    val subcategories: List<GroupCategory>? = null,
    val pageCount: Int,
    val pagePreviews: List<Group>
)
