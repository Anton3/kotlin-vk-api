package name.alatushkin.vkapi.generated.video.objects

data class VideoAlbumFull(
    val id: Long,
    val ownerId: Long,
    val title: String,
    val count: Long,
    val photo160: String? = null,
    val photo320: String? = null,
    val updatedTime: Long,
    val isSystem: Long? = null
)
