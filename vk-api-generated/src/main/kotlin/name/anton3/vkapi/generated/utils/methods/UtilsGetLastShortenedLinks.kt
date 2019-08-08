@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.utils.objects.LastShortenedLink
import name.anton3.vkapi.method.UserGroupServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/utils.getLastShortenedLinks]
 *
 * Returns a list of user's shortened links.
 *
 * @property count Number of links to return.
 * @property offset Offset needed to return a specific subset of links.
 */
data class UtilsGetLastShortenedLinks(
    var count: Int? = null,
    var offset: Int? = null
) : VkMethod<VkList<LastShortenedLink>>("utils.getLastShortenedLinks", jacksonTypeRef()),
    UserGroupServiceMethod
