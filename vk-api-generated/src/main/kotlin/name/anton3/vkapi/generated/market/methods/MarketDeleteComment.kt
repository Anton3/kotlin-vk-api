@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/market.deleteComment]
 *
 * Deletes an item's comment
 *
 * @property ownerId identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property commentId comment id
 */
data class MarketDeleteComment(
    var ownerId: Int,
    var commentId: Int
) : CheckedMethod<Boolean, UserMethod>("market.deleteComment", jacksonTypeRef())
