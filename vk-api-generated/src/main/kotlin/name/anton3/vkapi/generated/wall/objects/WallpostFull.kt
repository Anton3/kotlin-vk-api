@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.CommentsInfo
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.common.objects.RepostsInfo
import name.anton3.vkapi.vktypes.BoolInt
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
 * @property markedAsAds Information whether the post is marked as ads
 * @property accessKey Access key to private object
 * @property attachments No description
 * @property date Date of publishing in Unixtime
 * @property edited Date of editing in Unixtime
 * @property fromId Post author ID
 * @property geo No description
 * @property id Post ID
 * @property isArchived Is post archived, only for post owners
 * @property isFavorite Information whether the post in favorites list
 * @property likes Count of likes
 * @property ownerId Wall owner's ID
 * @property postSource No description
 * @property postType No description
 * @property reposts Count of views
 * @property signerId Post signer ID
 * @property text Post text
 * @property views Count of views
 */
@JsonDeserialize(`as` = Void::class)
data class WallpostFull(
    val copyHistory: List<Wallpost>? = null,
    val canEdit: BoolInt? = null,
    val createdBy: Int? = null,
    val canDelete: BoolInt? = null,
    val canPin: BoolInt? = null,
    val isPinned: Int? = null,
    val comments: CommentsInfo? = null,
    val markedAsAds: BoolInt? = null,
    override val accessKey: String? = null,
    override val attachments: List<WallpostAttachment>? = null,
    override val date: VkDate? = null,
    override val edited: Int? = null,
    override val fromId: Int? = null,
    override val geo: Geo? = null,
    override val id: Int? = null,
    override val isArchived: Boolean? = null,
    override val isFavorite: Boolean? = null,
    override val likes: LikesInfo? = null,
    override val ownerId: Int? = null,
    override val postSource: PostSource? = null,
    override val postType: PostType? = null,
    override val reposts: RepostsInfo? = null,
    override val signerId: Int? = null,
    override val text: String? = null,
    override val views: Views? = null
) : Wallpost
