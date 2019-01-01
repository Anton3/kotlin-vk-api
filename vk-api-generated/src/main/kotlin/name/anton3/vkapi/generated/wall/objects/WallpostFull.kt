package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.CommentsInfo
import name.anton3.vkapi.generated.common.objects.Geo
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.common.objects.RepostsInfo
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property copyHistory No description
 * @property canEdit Information whether current user can edit the post
 * @property createdBy Post creator ID (if post still can be edited)
 * @property canDelete Information whether current user can delete the post
 * @property canPin Information whether current user can pin the post
 * @property isPinned Information whether the post is pinned
 * @property comments No description
 * @property likes No description
 * @property reposts No description
 * @property markedAsAds Information whether the post is marked as ads
 * @property id Post ID
 * @property fromId Post author ID
 * @property ownerId Wall owner's ID
 * @property date Date of publishing in Unixtime
 * @property views Count of views
 * @property accessKey Access key to private object
 * @property postType No description
 * @property text Post text
 * @property signerId Post signer ID
 * @property attachments No description
 * @property geo No description
 * @property postSource No description
 */
@JsonDeserialize(`as` = Void::class)
data class WallpostFull(
    val copyHistory: List<Wallpost>? = null,
    val canEdit: Boolean? = null,
    val createdBy: Int? = null,
    val canDelete: Boolean? = null,
    val canPin: Boolean? = null,
    val isPinned: Int? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    val markedAsAds: Boolean? = null,
    override val id: Int? = null,
    override val fromId: Int? = null,
    override val ownerId: Int? = null,
    override val date: VkDate? = null,
    override val views: Views? = null,
    override val accessKey: String? = null,
    override val postType: PostType? = null,
    override val text: String? = null,
    override val signerId: Int? = null,
    override val attachments: List<WallpostAttachment>? = null,
    override val geo: Geo? = null,
    override val postSource: PostSource? = null
) : Wallpost
