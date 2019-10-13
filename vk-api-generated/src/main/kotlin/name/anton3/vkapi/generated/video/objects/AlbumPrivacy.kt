@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class AlbumPrivacy(override val value: String) : ValueEnum<String> {
    ALL("0"),
    FRIENDS("1"),
    FRIENDS_OF_FRIENDS("2"),
    ONLY_ME("3")
}
