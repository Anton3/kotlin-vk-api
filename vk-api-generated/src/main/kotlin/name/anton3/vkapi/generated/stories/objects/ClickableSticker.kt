@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

/**
 * No description
 *
 * @property type No description
 * @property clickableArea Vertices of the clickable area polygon. Prefer a rectangle
 * @property style Visual style of the sticker
 * @property mention VK mention, e.g. [id1|name] or [club1|name]
 * @property hashtag VK hashtag. Must start with # symbol
 */
data class ClickableSticker(
    val type: ClickableStickerType,
    val clickableArea: List<ClickableStickerPoint>,
    val style: ClickableStickerStyle? = null,
    val mention: String? = null,
    val hashtag: String? = null
)
