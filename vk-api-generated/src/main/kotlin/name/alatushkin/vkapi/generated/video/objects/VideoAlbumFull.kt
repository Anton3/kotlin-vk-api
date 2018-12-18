package name.anton3.vkapi.generated.video.objects

/**
 * No description
 *
 * @property id Album ID
 * @property ownerId Album owner's ID
 * @property title Album title
 * @property count Total number of videos in album
 * @property photo160 URL of the preview image with 160px in width
 * @property photo320 URL of the preview image with 320px in width
 * @property updatedTime Date when the album has been updated last time in Unixtime
 * @property isSystem Information whether album is system
 */
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
