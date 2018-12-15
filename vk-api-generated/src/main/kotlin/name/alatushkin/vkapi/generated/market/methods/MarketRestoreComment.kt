@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/market.restoreComment]
 *
 * Restores a recently deleted comment
 *
 * @property ownerId identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property commentId deleted comment id
 */
data class MarketRestoreComment(
    var ownerId: Long,
    var commentId: Long
) : VkMethod<Boolean>("market.restoreComment", jacksonTypeRef()),
    UserMethod
