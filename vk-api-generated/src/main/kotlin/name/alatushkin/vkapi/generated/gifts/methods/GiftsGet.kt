@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.gifts.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.gifts.objects.Gift
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/gifts.get]
 *
 * Returns a list of user gifts.
 *
 * @property userId User ID.
 * @property count Number of gifts to return.
 * @property offset Offset needed to return a specific subset of results.
 */
data class GiftsGet(
    var userId: Long? = null,
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<Gift>>("gifts.get", jacksonTypeRef()),
    UserMethod
