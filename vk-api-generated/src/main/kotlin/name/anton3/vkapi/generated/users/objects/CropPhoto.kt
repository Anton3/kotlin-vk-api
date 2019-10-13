@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.generated.photos.objects.Photo

/**
 * No description
 *
 * @property crop No description
 * @property photo No description
 * @property rect No description
 */
data class CropPhoto(
    val crop: CropPhotoCrop? = null,
    val photo: Photo? = null,
    val rect: CropPhotoRect? = null
)
