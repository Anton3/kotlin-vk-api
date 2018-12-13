@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.fave.objects.FavesLink
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

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
) : VkMethod<VkList<FavesLink>>(
    "fave.getLinks",
    jacksonTypeRef()
), UserMethod
