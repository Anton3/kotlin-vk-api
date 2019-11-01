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
 * @property likes Count of likes
 * @property ownerId Wall owner's ID
 * @property postSource No description
 * @property postType No description
 * @property reposts Count of views
 * @property signerId Post signer ID
 * @property text Post text
 * @property views Count of views
 */
@JsonDeserialize(`as` = WallpostImpl::class)
interface Wallpost {
    val accessKey: String?
    val attachments: List<WallpostAttachment>?
    val date: VkDate?
    val edited: Int?
    val fromId: Int?
    val geo: Geo?
    val id: Int?
    val isArchived: Boolean?
    val isFavorite: Boolean?
    val likes: LikesInfo?
    val ownerId: Int?
    val postSource: PostSource?
    val postType: PostType?
    val reposts: RepostsInfo?
    val signerId: Int?
    val text: String?
    val views: Views?
}
