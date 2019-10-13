@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody

/**
 * No description
 *
 * @property created Date when the album has been created in Unixtime
 * @property description Photo album description
 * @property id Photo album ID
 * @property ownerId Album owner's ID
 * @property size Photos number
 * @property thumb No description
 * @property title Photo album title
 * @property updated Date when the album has been updated last time in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class PhotoAlbum(
    val created: Int,
    val description: String? = null,
    val id: Int,
    val ownerId: Int,
    val size: Int,
    val thumb: Photo? = null,
    val title: String,
    val updated: Int
) : WallPostAttachmentBody
