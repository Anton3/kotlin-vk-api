package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.common.objects.CommentsInfo
import name.alatushkin.vkapi.generated.common.objects.Geo
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.common.objects.RepostsInfo
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Post ID
 * @property fromId Post author ID
 * @property toId Post addresse
 * @property date Date of publishing in Unixtime
 * @property postType No description
 * @property text Post text
 * @property canDelete Information whether current user can delete the post
 * @property signerId Post signer ID
 * @property attachments No description
 * @property geo No description
 * @property postSource No description
 * @property comments No description
 * @property likes No description
 * @property reposts No description
 * @property copyOwnerId Source post owner's ID
 * @property copyPostId Source post ID
 * @property copyText Repost comment
 */
data class WallpostAttached(
    val id: Long? = null,
    val fromId: Long? = null,
    val toId: Long? = null,
    val date: VkDate? = null,
    val postType: PostType? = null,
    val text: String? = null,
    val canDelete: Boolean? = null,
    val signerId: Long? = null,
    val attachments: List<WallpostAttachment>? = null,
    val geo: Geo? = null,
    val postSource: PostSource? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    val copyOwnerId: Long? = null,
    val copyPostId: Long? = null,
    val copyText: String? = null
) : MessageAttachment
