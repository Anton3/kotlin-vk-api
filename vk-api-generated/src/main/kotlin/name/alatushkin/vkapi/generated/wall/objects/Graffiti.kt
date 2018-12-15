package name.alatushkin.vkapi.generated.wall.objects

/**
 * No description
 *
 * @property id Graffiti ID
 * @property ownerId Graffiti owner's ID
 * @property photo200 URL of the preview image with 200 px in width
 * @property photo586 URL of the preview image with 586 px in width
 */
data class Graffiti(
    val id: Long? = null,
    val ownerId: Long? = null,
    val photo200: String? = null,
    val photo586: String? = null
) : WallpostAttachment
