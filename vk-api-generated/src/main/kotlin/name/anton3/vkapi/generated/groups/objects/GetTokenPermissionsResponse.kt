@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property mask No description
 * @property permissions No description
 */
data class GetTokenPermissionsResponse(
    val mask: Int,
    val permissions: List<TokenPermissionSetting>
)
