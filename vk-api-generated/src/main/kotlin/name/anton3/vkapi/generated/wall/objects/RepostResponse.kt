package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.vktypes.OkResponse

/**
 * No description
 *
 * @property success No description
 * @property postId Created post ID
 * @property repostsCount Reposts number
 * @property likesCount Reposts number
 */
data class RepostResponse(
    val success: OkResponse,
    val postId: Int,
    val repostsCount: Int,
    val likesCount: Int
)
