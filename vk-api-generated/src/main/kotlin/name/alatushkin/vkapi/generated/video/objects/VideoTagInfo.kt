package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.vktypes.PropertyExists
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Video ID
 * @property ownerId Video owner ID
 * @property title Video title
 * @property duration Video duration in seconds
 * @property description Video description
 * @property date Date when video has been uploaded in Unixtime
 * @property views Number of views
 * @property comments Number of comments
 * @property photo130 URL of the preview image with 130 px in width
 * @property photo320 URL of the preview image with 320 px in width
 * @property photo800 URL of the preview image with 800 px in width
 * @property accessKey Video access key
 * @property addingDate Date when the video has been added in Unixtime
 * @property player URL of the page with a player that can be used to play the video in the browser.
 * @property canEdit Information whether current user can edit the video
 * @property canAdd Information whether current user can add the video
 * @property processing Returns if the video is processing
 * @property live Returns if the video is live translation
 * @property files No description
 * @property placerId ID of the tag creator
 * @property tagCreated Date when tag has been added in Unixtime
 * @property tagId Tag ID
 */
data class VideoTagInfo(
    val id: Long? = null,
    val ownerId: Long? = null,
    val title: String? = null,
    val duration: Long? = null,
    val description: String? = null,
    val date: VkDate? = null,
    val views: Long? = null,
    val comments: Long? = null,
    val photo130: String? = null,
    val photo320: String? = null,
    val photo800: String? = null,
    val accessKey: String? = null,
    val addingDate: Long? = null,
    val player: String? = null,
    val canEdit: Boolean? = null,
    val canAdd: Boolean? = null,
    val processing: PropertyExists? = null,
    val live: PropertyExists? = null,
    val files: VideoFiles? = null,
    val placerId: Long? = null,
    val tagCreated: Long? = null,
    val tagId: Long? = null
)
