package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.wall.objects.WallComment

/**
 * No description
 *
 * @property count Total number
 * @property realOffset Real offset of the comments
 * @property items No description
 */
data class GetCommentsResponse(
    val count: Long? = null,
    val realOffset: Long? = null,
    val items: List<WallComment>? = null
)
