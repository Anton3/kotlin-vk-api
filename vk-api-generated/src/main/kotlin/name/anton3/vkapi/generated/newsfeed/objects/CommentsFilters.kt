@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class CommentsFilters(override val value: String) : ValueEnum<String> {
    POST("post"),
    PHOTO("photo"),
    VIDEO("video"),
    TOPIC("topic"),
    NOTE("note")
}
