package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property id Photo album ID
 * @property thumbId Thumb photo ID
 * @property thumbSrc URL of the thumb image
 * @property ownerId Album owner's ID
 * @property title Photo album title
 * @property description Photo album description
 * @property created Date when the album has been created in Unixtime
 * @property updated Date when the album has been updated last time in Unixtime
 * @property size Photos number
 * @property privacyView No description
 * @property privacyComment No description
 * @property uploadByAdminsOnly Information whether only community administrators can upload photos
 * @property commentsDisabled Information whether album comments are disabled
 * @property canUpload Information whether current user can upload photo to the album
 * @property thumbIsLast Information whether the album thumb is last photo
 * @property sizes No description
 */
data class PhotoAlbumFull(
    val id: Int,
    val thumbId: Int? = null,
    val thumbSrc: String? = null,
    val ownerId: Int,
    val title: String,
    val description: String? = null,
    val created: Int,
    val updated: Int,
    val size: Int,
    val privacyView: List<String>? = null,
    val privacyComment: List<String>? = null,
    val uploadByAdminsOnly: BoolInt? = null,
    val commentsDisabled: BoolInt? = null,
    val canUpload: BoolInt? = null,
    val thumbIsLast: BoolInt? = null,
    val sizes: List<PhotoSizes>? = null
)
