package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.vktypes.OkResponse

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
    val postId: Long,
    val repostsCount: Long,
    val likesCount: Long
)