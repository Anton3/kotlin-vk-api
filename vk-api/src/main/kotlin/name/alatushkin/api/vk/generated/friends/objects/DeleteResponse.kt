package name.alatushkin.api.vk.generated.friends.objects

import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.generated.friends.responses.DeleteResponseFriendDeleted
import name.alatushkin.api.vk.generated.friends.responses.DeleteResponseInRequestDeleted
import name.alatushkin.api.vk.generated.friends.responses.DeleteResponseOutRequestDeleted
import name.alatushkin.api.vk.generated.friends.responses.DeleteResponseSuggestionDeleted

data class DeleteResponse(
    val success: OkResponse,
    val friendDeleted: DeleteResponseFriendDeleted? = null,
    val outRequestDeleted: DeleteResponseOutRequestDeleted? = null,
    val inRequestDeleted: DeleteResponseInRequestDeleted? = null,
    val suggestionDeleted: DeleteResponseSuggestionDeleted? = null
)
