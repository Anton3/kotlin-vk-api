package name.alatushkin.vkapi.generated.fave.objects

/**
 * No description
 *
 * @property id Link ID
 * @property url Link URL
 * @property title Link title
 * @property description Link description
 * @property photo50 URL of the preview image with 50 px in width
 * @property photo100 URL of the preview image with 100 px in width
 * @property photo200 URL of the preview image with 200 px in width
 */
data class FavesLink(
    val id: Long? = null,
    val url: String? = null,
    val title: String? = null,
    val description: String? = null,
    val photo50: String? = null,
    val photo100: String? = null,
    val photo200: String? = null
)
