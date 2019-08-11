package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.generated.common.objects.Likes
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.PropertyExists
import name.anton3.vkapi.vktypes.VkDate

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
 * @property privacyView No description
 * @property privacyComment No description
 * @property canComment Information whether current user can comment the video
 * @property canRepost Information whether current user can comment the video
 * @property likes No description
 * @property repeat Information whether the video is repeated
 */
data class VideoFull(
    val id: Int? = null,
    val ownerId: Int? = null,
    val title: String? = null,
    val duration: Int? = null,
    val description: String? = null,
    val date: VkDate? = null,
    val views: Int? = null,
    val comments: Int? = null,
    val photo130: String? = null,
    val photo320: String? = null,
    val photo800: String? = null,
    val accessKey: String? = null,
    val addingDate: Int? = null,
    val player: String? = null,
    val canEdit: BoolInt? = null,
    val canAdd: BoolInt? = null,
    val processing: PropertyExists? = null,
    val live: PropertyExists? = null,
    val files: VideoFiles? = null,
    val privacyView: List<String>? = null,
    val privacyComment: List<String>? = null,
    val canComment: BoolInt? = null,
    val canRepost: BoolInt? = null,
    val likes: Likes? = null,
    val repeat: BoolInt? = null
)
