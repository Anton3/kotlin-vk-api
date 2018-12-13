package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.generated.wall.objects.WallpostFull

data class SearchResponse(
    val items: List<WallpostFull>? = null,
    val suggestedQueries: List<String>? = null
)
