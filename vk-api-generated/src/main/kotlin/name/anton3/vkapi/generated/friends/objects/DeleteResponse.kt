@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

import name.anton3.vkapi.vktypes.OkResponse
import name.anton3.vkapi.vktypes.PropertyExists

/**
 * No description
 *
 * @property success No description
 * @property friendDeleted Returns 1 if friend has been deleted
 * @property outRequestDeleted Returns 1 if out request has been canceled
 * @property inRequestDeleted Returns 1 if incoming request has been declined
 * @property suggestionDeleted Returns 1 if suggestion has been declined
 */
data class DeleteResponse(
    val success: OkResponse,
    val friendDeleted: PropertyExists? = null,
    val outRequestDeleted: PropertyExists? = null,
    val inRequestDeleted: PropertyExists? = null,
    val suggestionDeleted: PropertyExists? = null
)
