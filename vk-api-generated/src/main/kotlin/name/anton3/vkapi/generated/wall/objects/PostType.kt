@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class PostType(override val value: String) : ValueEnum<String> {
    POST("post"),
    COPY("copy"),
    REPLY("reply"),
    POSTPONE("postpone"),
    SUGGEST("suggest"),
    POST_ADS("post_ads")
}
