@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

/**
 * No description
 *
 * @property count Total number of videos in album
 * @property id Album ID
 * @property image Album cover image in different sizes
 * @property isSystem Information whether album is system
 * @property ownerId Album owner's ID
 * @property title Album title
 * @property updatedTime Date when the album has been updated last time in Unixtime
 */
data class VideoAlbumFull(
    val count: Int,
    val id: Int? = null,
    val image: List<VideoImage>? = null,
    val isSystem: Int? = null,
    val ownerId: Int,
    val title: String,
    val updatedTime: Int
)
