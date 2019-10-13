@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.market.objects.GetCommentsSort
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.generated.wall.objects.WallComment
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
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
 * @property offset No description
 * @property count Number of results to return.
 * @property sort Sort order ('asc' — from old to new, 'desc' — from new to old)
 * @property extended '1' — comments will be returned as numbered objects, in addition lists of 'profiles' and 'groups' objects will be returned.
 * @property fields List of additional profile fields to return. See the [vk.com/dev/fields|details]
 */
data class MarketGetComments(
    var ownerId: Int,
    var itemId: Int,
    var needLikes: Boolean? = null,
    var startCommentId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var sort: GetCommentsSort? = null,
    var extended: Boolean? = null,
    var fields: List<Fields>? = null
) : VkMethod<VkList<WallComment>, UserMethod>("market.getComments", jacksonTypeRef())
