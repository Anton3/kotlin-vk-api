@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.utils.objects.LastShortenedLink
import name.alatushkin.vkapi.tokens.UserGroupServiceMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/utils.getLastShortenedLinks]
 *
 * Returns a list of user's shortened links.
 *
 * @property count Number of links to return.
 * @property offset Offset needed to return a specific subset of links.
 */
data class UtilsGetLastShortenedLinks(
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<LastShortenedLink>>(
    "utils.getLastShortenedLinks",
    jacksonTypeRef()
), UserGroupServiceMethod
