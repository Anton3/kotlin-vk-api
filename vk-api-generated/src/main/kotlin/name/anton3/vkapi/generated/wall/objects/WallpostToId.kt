@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.CommentsInfo
import name.anton3.vkapi.generated.common.objects.Geo
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.common.objects.RepostsInfo
import name.anton3.vkapi.generated.notifications.objects.NotificationParent
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Post ID
 * @property fromId Post author ID
 * @property toId Wall owner's ID
 * @property date Date of publishing in Unixtime
 * @property postId wall post ID (if comment)
 * @property postType No description
 * @property text Post text
 * @property signerId Post signer ID
 * @property attachments No description
 * @property geo No description
 * @property postSource No description
 * @property comments No description
 * @property likes No description
 * @property reposts No description
 * @property copyOwnerId ID of the source post owner
 * @property copyPostId ID of the source post
 */
@JsonDeserialize(`as` = Void::class)
data class WallpostToId(
    val id: Int? = null,
    val fromId: Int? = null,
    val toId: Int? = null,
    val date: VkDate? = null,
    val postId: Int? = null,
    val postType: PostType? = null,
    val text: String? = null,
    val signerId: Int? = null,
    val attachments: List<WallpostAttachment>? = null,
    val geo: Geo? = null,
    val postSource: PostSource? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    val copyOwnerId: Int? = null,
    val copyPostId: Int? = null
) : NotificationParent
