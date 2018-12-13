package name.alatushkin.api.vk.generated.wall.objects

import name.alatushkin.api.vk.generated.common.objects.OkResponse

data class RepostResponse(
    val success: OkResponse,
    val postId: Long,
    val repostsCount: Long,
    val likesCount: Long
)
