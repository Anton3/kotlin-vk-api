package name.alatushkin.api.vk.generated.users.objects

import name.alatushkin.api.vk.generated.photos.objects.Photo

data class CropPhoto(
    val photo: Photo? = null,
    val crop: CropPhotoCrop? = null,
    val rect: CropPhotoRect? = null
)
