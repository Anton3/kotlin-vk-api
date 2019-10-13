@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonProperty
import name.anton3.vkapi.generated.common.objects.Likes
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.PropertyExists
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property accessKey Video access key
 * @property addingDate Date when the video has been added in Unixtime
 * @property canAdd No description
 * @property canAddToFaves No description
 * @property canComment No description
 * @property canEdit No description
 * @property canRepost No description
 * @property comments Number of comments
 * @property date Date when video has been uploaded in Unixtime
 * @property description Video description
 * @property duration Video duration in seconds
 * @property files No description
 * @property firstFrame No description
 * @property firstFrame640 URL of the first frame for the corresponding width.
 * @property firstFrame1280 URL of the first frame for the corresponding width.
 * @property id Video ID
 * @property image No description
 * @property likes No description
 * @property live No description
 * @property ownerId Video owner ID
 * @property player URL of the page with a player that can be used to play the video in the browser.
 * @property processing No description
 * @property repeat No description
 * @property title Video title
 * @property views Number of views
 */
data class VideoFull(
    val accessKey: String? = null,
    val addingDate: Int? = null,
    val canAdd: BoolInt? = null,
    val canAddToFaves: BoolInt? = null,
    val canComment: BoolInt? = null,
    val canEdit: BoolInt? = null,
    val canRepost: BoolInt? = null,
    val comments: Int? = null,
    val date: VkDate? = null,
    val description: String? = null,
    val duration: Int? = null,
    val files: VideoFiles? = null,
    val firstFrame: List<VideoImage>? = null,
    @get:JsonProperty("first_frame_640") val firstFrame640: String? = null,
    @get:JsonProperty("first_frame_1280") val firstFrame1280: String? = null,
    val id: Int? = null,
    val image: List<VideoImage>? = null,
    val likes: Likes? = null,
    val live: PropertyExists? = null,
    val ownerId: Int? = null,
    val player: String? = null,
    val processing: PropertyExists? = null,
    val repeat: BoolInt? = null,
    val title: String? = null,
    val views: Int? = null
)
