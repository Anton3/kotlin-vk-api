@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property firstName First name in request
 * @property id Request ID needed to cancel the request
 * @property lastName Last name in request
 * @property status No description
 * @property lang No description
 */
data class NameRequest(
    val firstName: String? = null,
    val id: Int? = null,
    val lastName: String? = null,
    val status: NameRequestStatus? = null,
    val lang: String? = null
)
