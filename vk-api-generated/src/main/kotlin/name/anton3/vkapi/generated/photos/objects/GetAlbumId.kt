@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetAlbumId(override val value: String) : ValueEnum<String> {
    PROFILE("profile"),
    WALL("wall"),
    SAVED("saved")
}
