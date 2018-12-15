package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.wall.objects.WallpostFull

/**
 * No description
 *
 * @property items No description
 * @property suggestedQueries No description
 */
data class SearchResponse(
    val items: List<WallpostFull>? = null,
    val suggestedQueries: List<String>? = null
)
