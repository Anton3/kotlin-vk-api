package name.anton3.vkapi.generated.friends.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property userId User ID
 * @property friendStatus No description
 * @property requestMessage Message sent with request
 * @property readState Information whether request is unviewed
 * @property sign MD5 hash for the result validation
 */
data class FriendStatus(
    val userId: Int,
    val friendStatus: FriendStatusStatus,
    val requestMessage: String? = null,
    val readState: BoolInt? = null,
    val sign: String? = null
)
