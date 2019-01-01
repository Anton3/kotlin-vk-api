package name.anton3.vkapi.generated.stories.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.video.objects.VideoFiles
import name.anton3.vkapi.vktypes.PropertyExists
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property firstFrame800 URL of the first frame for the corresponding width.
 * @property firstFrame320 URL of the first frame for the corresponding width.
 * @property firstFrame160 URL of the first frame for the corresponding width.
 * @property firstFrame130 URL of the first frame for the corresponding width.
 * @property isPrivate Information whether story is private (0 - no, 1 - yes).
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
 * @property photo640 URL of the preview image with 320 px in width
 * @property photo800 URL of the preview image with 800 px in width
 * @property accessKey Video access key
 * @property addingDate Date when the video has been added in Unixtime
 * @property player URL of the page with a player that can be used to play the video in the browser.
 * @property canEdit Information whether current user can edit the video
 * @property canAdd Information whether current user can add the video
 * @property processing Returns if the video is processing
 * @property live Returns if the video is live translation
 * @property files No description
 * @property platform No description
 * @property width Video width
 * @property height Video height
 */
@JsonDeserialize(`as` = Void::class)
data class StoryVideo(
    val firstFrame800: String? = null,
    val firstFrame320: String? = null,
    val firstFrame160: String? = null,
    val firstFrame130: String? = null,
    val isPrivate: Boolean? = null,
    override val id: Int? = null,
    override val ownerId: Int? = null,
    override val title: String? = null,
    override val duration: Int? = null,
    override val description: String? = null,
    override val date: VkDate? = null,
    override val views: Int? = null,
    override val comments: Int? = null,
    override val photo130: String? = null,
    override val photo320: String? = null,
    override val photo640: String? = null,
    override val photo800: String? = null,
    override val accessKey: String? = null,
    override val addingDate: Int? = null,
    override val player: String? = null,
    override val canEdit: Boolean? = null,
    override val canAdd: Boolean? = null,
    override val processing: PropertyExists? = null,
    override val live: PropertyExists? = null,
    override val files: VideoFiles? = null,
    override val platform: String? = null,
    override val width: Int? = null,
    override val height: Int? = null
) : Video
