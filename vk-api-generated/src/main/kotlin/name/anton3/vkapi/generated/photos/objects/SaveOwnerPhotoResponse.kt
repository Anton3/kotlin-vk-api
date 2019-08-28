@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

/**
 * No description
 *
 * @property photoHash Parameter for saveProfilePhoto method
 * @property photoSrc Uploaded image url
 */
data class SaveOwnerPhotoResponse(
    val photoHash: String,
    val photoSrc: String
)
