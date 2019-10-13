@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class BookmarkType(override val value: String) : ValueEnum<String> {
    POST("post"),
    VIDEO("video"),
    PRODUCT("product"),
    ARTICLE("article"),
    LINK("link")
}
