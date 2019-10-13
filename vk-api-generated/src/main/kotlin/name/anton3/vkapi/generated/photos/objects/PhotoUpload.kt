@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

/**
 * No description
 *
 * @property albumId Album ID
 * @property uploadUrl URL to upload photo
 * @property userId User ID
 */
data class PhotoUpload(
    val albumId: Int,
    val uploadUrl: String,
    val userId: Int
)
