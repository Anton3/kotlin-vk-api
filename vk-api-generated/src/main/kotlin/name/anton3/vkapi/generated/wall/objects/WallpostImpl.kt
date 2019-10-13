@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.common.objects.RepostsInfo
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property accessKey Access key to private object
 * @property attachments No description
 * @property date Date of publishing in Unixtime
 * @property edited Date of editing in Unixtime
 * @property fromId Post author ID
 * @property geo No description
 * @property id Post ID
 * @property isArchived Is post archived, only for post owners
 * @property isFavorite Information whether the post in favorites list
 * @property likes No description
 * @property ownerId Wall owner's ID
 * @property postSource No description
 * @property postType No description
 * @property reposts No description
 * @property signerId Post signer ID
 * @property text Post text
 * @property views No description
 */
@JsonDeserialize(`as` = Void::class)
data class WallpostImpl(
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
