package name.alatushkin.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property enabled Information whether catalog is enabled for current user
 * @property categories No description
 */
data class GetCatalogInfoExtendedResponse(
    val enabled: Long,
    val categories: List<GroupCategoryFull>? = null
)
