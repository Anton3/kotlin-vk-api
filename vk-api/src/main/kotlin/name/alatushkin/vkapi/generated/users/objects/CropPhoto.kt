package name.alatushkin.vkapi.generated.users.objects

import name.alatushkin.vkapi.generated.photos.objects.Photo

data class CropPhoto(
    val photo: Photo? = null,
    val crop: CropPhotoCrop? = null,
    val rect: CropPhotoRect? = null
)
