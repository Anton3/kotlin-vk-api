@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

/**
 * No description
 *
 * @property userId User ID
 * @property from ID of the user by whom friend has been suggested
 * @property mutual No description
 */
data class Requests(
    val userId: Int? = null,
    val from: String? = null,
    val mutual: RequestsMutual? = null
)
