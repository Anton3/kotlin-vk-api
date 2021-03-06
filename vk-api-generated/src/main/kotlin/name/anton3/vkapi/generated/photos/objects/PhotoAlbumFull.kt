@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property canUpload Information whether current user can upload photo to the album
 * @property commentsDisabled Information whether album comments are disabled
 * @property created Date when the album has been created in Unixtime
 * @property description Photo album description
 * @property id Photo album ID
 * @property ownerId Album owner's ID
 * @property size Photos number
 * @property sizes No description
 * @property thumbId Thumb photo ID
 * @property thumbIsLast Information whether the album thumb is last photo
 * @property thumbSrc URL of the thumb image
 * @property title Photo album title
 * @property updated Date when the album has been updated last time in Unixtime
 * @property uploadByAdminsOnly Information whether only community administrators can upload photos
 */
data class PhotoAlbumFull(
    val canUpload: BoolInt? = null,
    val commentsDisabled: BoolInt? = null,
    val created: Int,
    val description: String? = null,
    val id: Int,
    val ownerId: Int,
    val size: Int,
    val sizes: List<PhotoSizes>? = null,
    val thumbId: Int? = null,
    val thumbIsLast: BoolInt? = null,
    val thumbSrc: String? = null,
    val title: String,
    val updated: Int,
    val uploadByAdminsOnly: BoolInt? = null
)
