@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.market.objects.GetCommentsSort
import name.anton3.vkapi.generated.wall.objects.WallComment
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.getComments]
 *
 * Returns comments list for an item.
 *
 * @property ownerId ID of an item owner community
 * @property itemId Item ID.
 * @property needLikes '1' — to return likes info.
 * @property startCommentId ID of a comment to start a list from (details below).
 * @property count Number of results to return.
 * @property sort Sort order ('asc' — from old to new, 'desc' — from new to old)
 * @property extended '1' — comments will be returned as numbered objects, in addition lists of 'profiles' and 'groups' objects will be returned.
 * @property fields List of additional profile fields to return. See the [vk.com/dev/fields|details]
 */
data class MarketGetComments(
    var ownerId: Long,
    var itemId: Long,
    var needLikes: Boolean? = null,
    var startCommentId: Long? = null,
    var count: Long? = null,
    var sort: GetCommentsSort? = null,
    var extended: Boolean? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<WallComment>>("market.getComments", jacksonTypeRef()),
    UserMethod
