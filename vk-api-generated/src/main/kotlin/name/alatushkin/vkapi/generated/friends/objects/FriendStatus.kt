package name.alatushkin.vkapi.generated.friends.objects

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
    val userId: Long,
    val friendStatus: FriendStatusStatus,
    val requestMessage: String? = null,
    val readState: Boolean? = null,
    val sign: String? = null
)
