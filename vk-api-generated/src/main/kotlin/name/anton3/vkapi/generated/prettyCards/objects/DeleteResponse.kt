@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.prettyCards.objects

/**
 * No description
 *
 * @property ownerId Owner ID of deleted pretty card
 * @property cardId Card ID of deleted pretty card
 * @property error Error reason if error happened
 */
data class DeleteResponse(
    val ownerId: Int,
    val cardId: String,
    val error: String? = null
)
