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
    val ownerId: Long? = null,
    val itemId: Long? = null,
    val thumbSrc: String? = null
)
