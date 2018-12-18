package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.generated.common.objects.Geo
import name.anton3.vkapi.vktypes.VkDate

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
data class WallpostImpl(
    override val id: Long? = null,
    override val fromId: Long? = null,
    override val ownerId: Long? = null,
    override val date: VkDate? = null,
    override val views: Views? = null,
    override val accessKey: String? = null,
    override val postType: PostType? = null,
    override val text: String? = null,
    override val signerId: Long? = null,
    override val attachments: List<WallpostAttachment>? = null,
    override val geo: Geo? = null,
    override val postSource: PostSource? = null
) : Wallpost
