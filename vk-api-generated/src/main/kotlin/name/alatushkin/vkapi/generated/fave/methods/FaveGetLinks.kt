@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.fave.objects.FavesLink
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/fave.getLinks]
 *
 * Returns a list of links that the current user has bookmarked.
 *
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of results to return.
 */
data class FaveGetLinks(
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<FavesLink>>("fave.getLinks", jacksonTypeRef()),
    UserMethod
