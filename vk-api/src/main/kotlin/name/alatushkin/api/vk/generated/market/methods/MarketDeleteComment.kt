@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.deleteComment]
 *
 * Deletes an item's comment
 *
 * @property ownerId identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property commentId comment id
 */
data class MarketDeleteComment(
    var ownerId: Long,
    var commentId: Long
) : VkMethod<BoolInt>(
    "market.deleteComment",
    jacksonTypeRef()
), UserMethod
