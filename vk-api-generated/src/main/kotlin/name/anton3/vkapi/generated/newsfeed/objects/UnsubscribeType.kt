@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class UnsubscribeType(override val value: String) : ValueEnum<String> {
    NOTE("note"),
    PHOTO("photo"),
    POST("post"),
    TOPIC("topic"),
    VIDEO("video")
}
