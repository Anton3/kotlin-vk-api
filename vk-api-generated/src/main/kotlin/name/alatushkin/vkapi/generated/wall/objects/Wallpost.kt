package name.alatushkin.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.vkapi.generated.common.objects.Geo
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
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
@JsonDeserialize(`as` = WallpostImpl::class)
interface Wallpost {
    val id: Long?
    val fromId: Long?
    val ownerId: Long?
    val date: VkDate?
    val views: Views?
    val accessKey: String?
    val postType: PostType?
    val text: String?
    val signerId: Long?
    val attachments: List<WallpostAttachment>?
    val geo: Geo?
    val postSource: PostSource?
}
