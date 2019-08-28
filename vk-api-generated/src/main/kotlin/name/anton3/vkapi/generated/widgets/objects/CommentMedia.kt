@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.objects

/**
 * No description
 *
 * @property type No description
 * @property ownerId Media owner's ID
 * @property itemId Media item ID
 * @property thumbSrc URL of the preview image (type=photo only)
 */
data class CommentMedia(
    val type: CommentMediaType? = null,
    val ownerId: Int? = null,
    val itemId: Int? = null,
    val thumbSrc: String? = null
)
