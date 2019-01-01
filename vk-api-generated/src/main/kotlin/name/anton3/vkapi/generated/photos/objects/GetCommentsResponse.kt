package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.generated.wall.objects.WallComment

/**
 * No description
 *
 * @property count Total number
 * @property realOffset Real offset of the comments
 * @property items No description
 */
data class GetCommentsResponse(
    val count: Int? = null,
    val realOffset: Int? = null,
    val items: List<WallComment>? = null
)
