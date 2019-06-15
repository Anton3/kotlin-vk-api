package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody

/**
 * No description
 *
 * @property id Photo album ID
 * @property thumb No description
 * @property ownerId Album owner's ID
 * @property title Photo album title
 * @property description Photo album description
 * @property created Date when the album has been created in Unixtime
 * @property updated Date when the album has been updated last time in Unixtime
 * @property size Photos number
 */
@JsonDeserialize(`as` = Void::class)
data class PhotoAlbum(
    val id: Int,
    val thumb: Photo? = null,
    val ownerId: Int,
    val title: String,
    val description: String? = null,
    val created: Int,
    val updated: Int,
    val size: Int
) : WallPostAttachmentBody
