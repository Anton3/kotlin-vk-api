package name.alatushkin.vkapi.generated.docs.objects

import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Document ID
 * @property ownerId Document owner ID
 * @property title Document title
 * @property size File size in bites
 * @property ext File extension
 * @property url File URL
 * @property date Date when file has been uploaded in Unixtime
 * @property type Doc type
 * @property preview No description
 * @property accessKey Access key for the document
 */
data class Doc(
    val id: Long,
    val ownerId: Long,
    val title: String,
    val size: Long,
    val ext: String,
    val url: String? = null,
    val date: VkDate,
    val type: DocType,
    val preview: DocPreview? = null,
    val accessKey: String? = null
) : WallpostAttachment,
    CommentAttachment,
    MessageAttachment
