@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property id Request ID needed to cancel the request
 * @property status No description
 * @property firstName First name in request
 * @property lastName Last name in request
 */
data class NameRequest(
    val id: Int? = null,
    val status: NameRequestStatus? = null,
    val firstName: String? = null,
    val lastName: String? = null
)
