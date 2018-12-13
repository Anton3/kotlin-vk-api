package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.wall.objects.WallComment

data class GetCommentsResponse(
    val count: Long? = null,
    val realOffset: Long? = null,
    val items: List<WallComment>? = null
)
