@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

/**
 * No description
 *
 * @property from ID of the user by whom friend has been suggested
 * @property mutual No description
 * @property userId User ID
 */
data class Requests(
    val from: String? = null,
    val mutual: RequestsMutual? = null,
    val userId: Int? = null
)
