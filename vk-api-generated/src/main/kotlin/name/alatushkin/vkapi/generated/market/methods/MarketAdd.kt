@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.market.objects.AddResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
    var ownerId: Long,
    var name: String,
    var description: String,
    var categoryId: Long,
    var price: Double,
    var deleted: Boolean? = null,
    var mainPhotoId: Long,
    var photoIds: List<Long>? = null
) : VkMethod<AddResponse>("market.add", jacksonTypeRef()),
    UserMethod
