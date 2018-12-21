@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.edit]
 *
 * Edits an item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property name Item name.
 * @property description Item description.
 * @property categoryId Item category ID.
 * @property price Item price.
 * @property deleted Item status ('1' — deleted, '0' — not deleted).
 * @property mainPhotoId Cover photo ID.
 * @property photoIds IDs of additional photos.
 */
data class MarketEdit(
    var ownerId: Long,
    var itemId: Long,
    var name: String,
    var description: String,
    var categoryId: Long,
    var price: Double,
    var deleted: Boolean? = null,
    var mainPhotoId: Long,
    var photoIds: List<Long>? = null
) : VkMethod<OkResponse>("market.edit", jacksonTypeRef()),
    UserMethod
