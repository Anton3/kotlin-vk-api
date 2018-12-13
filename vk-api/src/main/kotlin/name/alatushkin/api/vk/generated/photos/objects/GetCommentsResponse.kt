package name.alatushkin.api.vk.generated.photos.objects

import name.alatushkin.api.vk.generated.wall.objects.WallComment

data class GetCommentsResponse(
    val count: Long? = null,
    val realOffset: Long? = null,
    val items: List<WallComment>? = null
)
