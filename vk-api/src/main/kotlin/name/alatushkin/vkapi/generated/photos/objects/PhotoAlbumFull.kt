package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class PhotoAlbumFull(
    val id: Long,
    val thumbId: Long? = null,
    val thumbSrc: String? = null,
    val ownerId: Long,
    val title: String,
    val description: String? = null,
    val created: Long,
    val updated: Long,
    val size: Long,
    val privacyView: List<String>? = null,
    val privacyComment: List<String>? = null,
    val uploadByAdminsOnly: BoolInt? = null,
    val commentsDisabled: BoolInt? = null,
    val canUpload: BoolInt? = null,
    val thumbIsLast: BoolInt? = null,
    val sizes: List<PhotoSizes>? = null
)
