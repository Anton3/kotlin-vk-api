@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

/**
 * No description
 *
 * @property height Height in px
 * @property url URL of the image
 * @property type No description
 * @property width Width in px
 */
data class PhotoSizes(
    val height: Int,
    val url: String? = null,
    val type: String,
    val width: Int
)
