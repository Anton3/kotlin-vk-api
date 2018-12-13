@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.newsfeed.objects.ListMin
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/newsfeed.getLists]
 *
 * Returns a list of newsfeeds followed by the current user.
 *
 * @property listIds numeric list identifiers.
 */
data class NewsfeedGetLists(
    var listIds: List<Long>? = null
) : VkMethod<VkList<ListMin>>(
    "newsfeed.getLists",
    jacksonTypeRef()
), UserMethod
