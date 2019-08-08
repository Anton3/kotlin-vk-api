@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.market.objects.AddResponse
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/market.add]
 *
 * Ads a new item to the market.
 *
 * @property ownerId ID of an item owner community.
 * @property name Item name.
 * @property description Item description.
 * @property categoryId Item category ID.
 * @property price Item price.
 * @property deleted Item status ('1' — deleted, '0' — not deleted).
 * @property mainPhotoId Cover photo ID.
 * @property photoIds IDs of additional photos.
 */
data class MarketAdd(
    var ownerId: Int,
    var name: String,
    var description: String,
    var categoryId: Int,
    var price: Double,
    var deleted: Boolean? = null,
    var mainPhotoId: Int,
    var photoIds: List<Int>? = null
) : VkMethod<AddResponse>("market.add", jacksonTypeRef()),
    UserMethod
