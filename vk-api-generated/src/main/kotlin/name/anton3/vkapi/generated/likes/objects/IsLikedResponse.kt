package name.anton3.vkapi.generated.likes.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property liked Information whether user liked the object
 * @property copied Information whether user reposted the object
 */
data class IsLikedResponse(
    val liked: BoolInt,
    val copied: BoolInt
)
