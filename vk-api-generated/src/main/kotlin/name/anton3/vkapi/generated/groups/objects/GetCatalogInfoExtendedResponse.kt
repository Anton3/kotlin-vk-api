@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property enabled Information whether catalog is enabled for current user
 * @property categories No description
 */
data class GetCatalogInfoExtendedResponse(
    val enabled: Int,
    val categories: List<GroupCategoryFull>? = null
)
