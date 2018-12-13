package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment

data class PhotoAlbum(
    val id: Long,
    val thumb: Photo? = null,
    val ownerId: Long,
    val title: String,
    val description: String? = null,
    val created: Long,
    val updated: Long,
    val size: Long
) : WallpostAttachment
