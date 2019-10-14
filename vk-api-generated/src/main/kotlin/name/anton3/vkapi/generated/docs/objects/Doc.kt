@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property accessKey Access key for the document
 * @property date Date when file has been uploaded in Unixtime
 * @property ext File extension
 * @property id Document ID
 * @property isLicensed No description
 * @property ownerId Document owner ID
 * @property preview No description
 * @property size File size in bites
 * @property title Document title
 * @property type Doc type
 * @property url File URL
 */
@JsonDeserialize(`as` = Void::class)
data class Doc(
    val accessKey: String? = null,
    val date: VkDate,
    val ext: String,
    val id: Int,
    val isLicensed: BoolInt? = null,
    val ownerId: Int,
    val preview: DocPreview? = null,
    val size: Int,
    val title: String,
    val type: DocType,
    val url: String? = null
) : CommentAttachmentBody, SaveDocBody, WallPostAttachmentBody, MessageAttachmentBody
