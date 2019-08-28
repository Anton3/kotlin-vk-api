@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

/**
 * No description
 *
 * @property uploadUrl URL to upload photo
 * @property albumId Album ID
 * @property userId User ID
 */
data class PhotoUpload(
    val uploadUrl: String,
    val albumId: Int,
    val userId: Int
)
