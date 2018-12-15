package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.common.objects.ObjectWithName

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
