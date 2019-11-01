@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.objects

import name.anton3.vkapi.generated.common.objects.Link
import name.anton3.vkapi.generated.market.objects.MarketItem
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.wall.objects.WallpostFull

/**
 * No description
 *
 * @property addedDate Timestamp, when this item was bookmarked
 * @property link No description
 * @property post No description
 * @property product No description
 * @property seen Has user seen this item
 * @property tags No description
 * @property type Item type
 * @property video No description
 */
data class Bookmark(
    val addedDate: Int,
    val link: Link? = null,
    val post: WallpostFull? = null,
    val product: MarketItem? = null,
    val seen: Boolean,
    val tags: List<Tag>,
    val type: BookmarkType,
    val video: Video? = null
)
