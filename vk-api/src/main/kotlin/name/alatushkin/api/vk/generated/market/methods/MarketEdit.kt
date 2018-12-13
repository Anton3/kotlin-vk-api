@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "market.edit",
    jacksonTypeRef()
), UserMethod
