@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.utils.objects.LastShortenedLink
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

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
