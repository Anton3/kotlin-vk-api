@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

/**
 * No description
 *
 * @property originalWidth Width of original photo or video
 * @property originalHeight Height of original photo or video
 * @property clickableStickers No description
 */
data class ClickableStickers(
    val originalWidth: Int,
    val originalHeight: Int,
    val clickableStickers: List<ClickableSticker>
)
