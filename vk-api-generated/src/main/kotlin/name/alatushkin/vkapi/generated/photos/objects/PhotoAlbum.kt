package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment

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
