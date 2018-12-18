package name.anton3.vkapi.generated.likes.objects

/**
 * No description
 *
 * @property liked Information whether user liked the object
 * @property copied Information whether user reposted the object
 */
data class IsLikedResponse(
    val liked: Boolean,
    val copied: Boolean
)
