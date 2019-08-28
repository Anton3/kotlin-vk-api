@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class UnignoreItemType(override val value: String) : ValueEnum<String> {
    WALL("wall"),
    TAG("tag"),
    PROFILEPHOTO("profilephoto"),
    VIDEO("video"),
    AUDIO("audio")
}
