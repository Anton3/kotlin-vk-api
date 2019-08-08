@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.gifts.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.gifts.objects.Gift
import name.anton3.vkapi.method.UserMethod
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
    var userId: Int? = null,
    var count: Int? = null,
    var offset: Int? = null
) : VkMethod<VkList<Gift>>("gifts.get", jacksonTypeRef()),
    UserMethod
