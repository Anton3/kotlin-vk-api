@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.gifts.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.gifts.objects.Gift
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
) : VkMethod<VkList<Gift>>(
    "gifts.get",
    jacksonTypeRef()
), UserMethod
