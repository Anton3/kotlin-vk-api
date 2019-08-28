@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.notifications.objects.NotificationParent
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
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
@JsonDeserialize(`as` = VideoImpl::class)
interface Video : WallPostAttachmentBody, CommentAttachmentBody, MessageAttachmentBody, NotificationParent {
    val id: Int?
    val ownerId: Int?
    val title: String?
    val duration: Int?
    val description: String?
    val date: VkDate?
    val views: Int?
    val comments: Int?
    val photo130: String?
    val photo320: String?
    val photo640: String?
    val photo800: String?
    val accessKey: String?
    val addingDate: Int?
    val player: String?
    val canEdit: BoolInt?
    val canAdd: BoolInt?
    val processing: PropertyExists?
    val live: PropertyExists?
    val files: VideoFiles?
    val platform: String?
    val width: Int?
    val height: Int?
}
