@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ItemWallpostType(override val value: String) : ValueEnum<String> {
    POST("post"),
    COPY("copy"),
    REPLY("reply")
}
