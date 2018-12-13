package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.common.objects.OkResponse

data class RepostResponse(
    val success: OkResponse,
    val postId: Long,
    val repostsCount: Long,
    val likesCount: Long
)
