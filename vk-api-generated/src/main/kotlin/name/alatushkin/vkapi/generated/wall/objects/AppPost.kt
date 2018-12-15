package name.alatushkin.vkapi.generated.wall.objects

/**
 * No description
 *
 * @property id Application ID
 * @property name Application name
 * @property photo130 URL of the preview image with 130 px in width
 * @property photo604 URL of the preview image with 604 px in width
 */
data class AppPost(
    val id: Long? = null,
    val name: String? = null,
    val photo130: String? = null,
    val photo604: String? = null
) : WallpostAttachment
