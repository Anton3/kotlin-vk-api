@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.CommentsInfo
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.common.objects.RepostsInfo
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.notifications.objects.NotificationParent
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property attachments No description
 * @property comments No description
 * @property copyOwnerId ID of the source post owner
 * @property copyPostId ID of the source post
 * @property date Date of publishing in Unixtime
 * @property fromId Post author ID
 * @property geo No description
 * @property id Post ID
 * @property likes No description
 * @property postId wall post ID (if comment)
 * @property postSource No description
 * @property postType No description
 * @property reposts No description
 * @property signerId Post signer ID
 * @property text Post text
 * @property toId Wall owner's ID
 */
@JsonDeserialize(`as` = Void::class)
data class WallpostToId(
    val attachments: List<WallpostAttachment>? = null,
    val comments: CommentsInfo? = null,
    val copyOwnerId: Int? = null,
    val copyPostId: Int? = null,
    val date: VkDate? = null,
    val fromId: Int? = null,
    val geo: Geo? = null,
    val id: Int? = null,
    val likes: LikesInfo? = null,
    val postId: Int? = null,
    val postSource: PostSource? = null,
    val postType: PostType? = null,
    val reposts: RepostsInfo? = null,
    val signerId: Int? = null,
    val text: String? = null,
    val toId: Int? = null
) : MessageAttachmentBody, NotificationParent
