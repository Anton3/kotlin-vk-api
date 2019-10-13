@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.objects

/**
 * No description
 *
 * @property itemId Media item ID
 * @property ownerId Media owner's ID
 * @property thumbSrc URL of the preview image (type=photo only)
 * @property type No description
 */
data class CommentMedia(
    val itemId: Int? = null,
    val ownerId: Int? = null,
    val thumbSrc: String? = null,
    val type: CommentMediaType? = null
)
