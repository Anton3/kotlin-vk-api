@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property friendStatus No description
 * @property readState No description
 * @property requestMessage Message sent with request
 * @property sign MD5 hash for the result validation
 * @property userId User ID
 */
data class FriendStatus(
    val friendStatus: FriendStatusStatus,
    val readState: BoolInt? = null,
    val requestMessage: String? = null,
    val sign: String? = null,
    val userId: Int
)
