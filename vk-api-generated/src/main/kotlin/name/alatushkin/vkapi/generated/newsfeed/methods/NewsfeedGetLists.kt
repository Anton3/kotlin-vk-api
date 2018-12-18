@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.newsfeed.objects.ListMin
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/newsfeed.getLists]
 *
 * Returns a list of newsfeeds followed by the current user.
 *
 * @property listIds numeric list identifiers.
 */
data class NewsfeedGetLists(
    var listIds: List<Long>? = null
) : VkMethod<VkList<ListMin>>("newsfeed.getLists", jacksonTypeRef()),
    UserMethod
