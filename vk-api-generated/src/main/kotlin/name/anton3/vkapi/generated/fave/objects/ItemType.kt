@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ItemType(override val value: String) : ValueEnum<String> {
    ARTICLE("article"),
    LINK("link"),
    NARRATIVE("narrative"),
    PAGE("page"),
    PODCAST("podcast"),
    POST("post"),
    PRODUCT("product"),
    VIDEO("video")
}
