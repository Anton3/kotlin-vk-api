@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property id User ID
 * @property permissions No description
 * @property role No description
 */
data class MemberRole(
    val id: Int? = null,
    val permissions: List<MemberRolePermission>? = null,
    val role: MemberRoleStatus? = null
)
