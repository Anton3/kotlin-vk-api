package name.alatushkin.vkapi.generated.friends.objects

import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.generated.friends.responses.DeleteResponseFriendDeleted
import name.alatushkin.vkapi.generated.friends.responses.DeleteResponseInRequestDeleted
import name.alatushkin.vkapi.generated.friends.responses.DeleteResponseOutRequestDeleted
import name.alatushkin.vkapi.generated.friends.responses.DeleteResponseSuggestionDeleted

data class DeleteResponse(
    val success: OkResponse,
    val friendDeleted: DeleteResponseFriendDeleted? = null,
    val outRequestDeleted: DeleteResponseOutRequestDeleted? = null,
    val inRequestDeleted: DeleteResponseInRequestDeleted? = null,
    val suggestionDeleted: DeleteResponseSuggestionDeleted? = null
)
