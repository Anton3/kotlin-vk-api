@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class IgnoreItemType(override val value: String) : ValueEnum<String> {
    POST_ON_THE_WALL("wall"),
    TAG_ON_A_PHOTO("tag"),
    PROFILE_PHOTO("profilephoto"),
    VIDEO("video"),
    AUDIO("audio")
}
