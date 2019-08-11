package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Element ID
 * @property ownerId Element owner's ID
 * @property title Element title
 * @property type No description
 * @property description Element description
 * @property duration Duration in seconds
 * @property photo130 URL of the preview image with 130 px in width
 * @property photo160 URL of the preview image with 160 px in width
 * @property photo320 URL of the preview image with 320 px in width
 * @property photo640 URL of the preview image with 640 px in width
 * @property photo800 URL of the preview image with 800 px in width
 * @property date Date when the element has been created
 * @property views Views number
 * @property comments Comments number
 * @property canAdd Information whether current user can add the video
 * @property canEdit Information whether current user can edit the video
 * @property isPrivate Information whether the video is private
 * @property count Videos number (for album)
 * @property updatedTime Date of last update (for album) in Unixtime
 */
data class CatElement(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val type: CatElementType,
    val description: String? = null,
    val duration: Int? = null,
    val photo130: String? = null,
    val photo160: String? = null,
    val photo320: String? = null,
    val photo640: String? = null,
    val photo800: String? = null,
    val date: VkDate? = null,
    val views: Int? = null,
    val comments: Int? = null,
    val canAdd: BoolInt? = null,
    val canEdit: BoolInt? = null,
    val isPrivate: BoolInt? = null,
    val count: Int? = null,
    val updatedTime: Int? = null
)
