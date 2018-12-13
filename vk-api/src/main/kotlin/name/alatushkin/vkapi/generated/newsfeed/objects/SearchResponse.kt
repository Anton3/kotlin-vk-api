package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.wall.objects.WallpostFull

data class SearchResponse(
    val items: List<WallpostFull>? = null,
    val suggestedQueries: List<String>? = null
)
