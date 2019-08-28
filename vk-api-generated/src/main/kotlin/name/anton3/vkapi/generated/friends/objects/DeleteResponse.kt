@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

import name.anton3.vkapi.generated.friends.responses.DeleteResponseFriendDeleted
import name.anton3.vkapi.generated.friends.responses.DeleteResponseInRequestDeleted
import name.anton3.vkapi.generated.friends.responses.DeleteResponseOutRequestDeleted
import name.anton3.vkapi.generated.friends.responses.DeleteResponseSuggestionDeleted
import name.anton3.vkapi.vktypes.OkResponse

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
    val friendDeleted: DeleteResponseFriendDeleted? = null,
    val outRequestDeleted: DeleteResponseOutRequestDeleted? = null,
    val inRequestDeleted: DeleteResponseInRequestDeleted? = null,
    val suggestionDeleted: DeleteResponseSuggestionDeleted? = null
)
