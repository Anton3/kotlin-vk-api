package name.alatushkin.vkapi.generated.wall.objects

/**
 * No description
 *
 * @property id Photo ID
 * @property ownerId Photo owner's ID
 * @property photo130 URL of the preview image with 130 px in width
 * @property photo604 URL of the preview image with 604 px in width
 */
data class PostedPhoto(
    val id: Long? = null,
    val ownerId: Long? = null,
    val photo130: String? = null,
    val photo604: String? = null
) : WallpostAttachment
