package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.generated.common.objects.ObjectWithName

/**
 * No description
 *
 * @property id Category ID
 * @property name Category name
 * @property subcategories No description
 */
data class GroupCategory(
    val id: Long,
    val name: String,
    val subcategories: List<ObjectWithName>? = null
)
