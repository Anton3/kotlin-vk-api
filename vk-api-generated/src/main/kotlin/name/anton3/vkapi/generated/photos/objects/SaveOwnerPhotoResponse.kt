@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

/**
 * No description
 *
 * @property photoHash Photo hash
 * @property photoSrc Uploaded image url
 * @property photoSrcBig Uploaded image url
 * @property photoSrcSmall Uploaded image url
 * @property saved Returns 1 if profile photo is saved
 * @property postId Created post ID
 */
data class SaveOwnerPhotoResponse(
    val photoHash: String,
    val photoSrc: String,
    val photoSrcBig: String? = null,
    val photoSrcSmall: String? = null,
    val saved: Int? = null,
    val postId: Int? = null
)
