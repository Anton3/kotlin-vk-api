package name.alatushkin.vkapi.generated.ads.objects

import name.alatushkin.vkapi.generated.common.objects.ObjectWithName

/**
 * No description
 *
 * @property id Category ID
 * @property name Category name
 * @property subcategories No description
 */
data class Category(
    val id: Long,
    val name: String,
    val subcategories: List<ObjectWithName>? = null
)
