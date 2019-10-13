@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.video.objects.VideoFiles
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.PropertyExists
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property isPrivate No description
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
 * @property canEdit No description
 * @property canAdd No description
 * @property processing No description
 * @property live No description
 * @property files No description
 * @property platform No description
 * @property width Video width
 * @property height Video height
 */
@JsonDeserialize(`as` = Void::class)
data class StoryVideo(
    val isPrivate: BoolInt? = null,
    override val id: Int? = null,
    override val ownerId: Int? = null,
    override val title: String? = null,
    override val duration: Int? = null,
    override val description: String? = null,
    override val date: VkDate? = null,
    override val views: Int? = null,
    override val comments: Int? = null,
    @get:JsonProperty("photo_130") override val photo130: String? = null,
    @get:JsonProperty("photo_320") override val photo320: String? = null,
    @get:JsonProperty("photo_640") override val photo640: String? = null,
    @get:JsonProperty("photo_800") override val photo800: String? = null,
    override val accessKey: String? = null,
    override val addingDate: Int? = null,
    override val player: String? = null,
    override val canEdit: BoolInt? = null,
    override val canAdd: BoolInt? = null,
    override val processing: PropertyExists? = null,
    override val live: PropertyExists? = null,
    override val files: VideoFiles? = null,
    override val platform: String? = null,
    override val width: Int? = null,
    override val height: Int? = null
) : Video
