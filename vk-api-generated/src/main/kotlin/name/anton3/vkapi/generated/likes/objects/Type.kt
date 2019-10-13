@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.likes.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Type(override val value: String) : ValueEnum<String> {
    POST("post"),
    COMMENT("comment"),
    PHOTO("photo"),
    AUDIO("audio"),
    VIDEO("video"),
    NOTE("note"),
    MARKET("market"),
    PHOTO_COMMENT("photo_comment"),
    VIDEO_COMMENT("video_comment"),
    TOPIC_COMMENT("topic_comment"),
    MARKET_COMMENT("market_comment"),
    SITEPAGE("sitepage")
}
